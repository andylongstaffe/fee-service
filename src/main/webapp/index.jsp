<html>
<body>
	<h2>Fee Service API</h2>
	<p>Welcome to the Fee Service.</p>
	<p>Purpose: Given a product code, returns fee information for a given product
	<h3>Examples</h3>
	<div>
		<code>GET /fee/product/p09a</code> 
		<p><a href="rest/fee/product/p09a">Try it</a></p>
	</div>
	<p>
		Returns a
		<code>Product Fee</code>
		object:
	</p>
	<code>
		<pre>
  { 
    "productCode":"p09a",
    "productGroup":"patents",    // are we still going with this?
    "price": {
      "amount":"150.00"
      "vatRate":"0.00",
      "currency":"gbp"
    },
    "date":"17/07/2014"         // date requested? should this be a date range?   
  }
</pre>
	</code>
	<ul>
		<li>Currency identified by their <a href="http://www.iso.org/iso/currency_codes">ISO 4217</a> standard. <a href="http://en.wikipedia.org/wiki/ISO_4217">List
				of codes</a>.
		</li>
		<li>Supported currencies:
			<ul>
				<li>GBP - British Pound</li>
				<li>CHF - Swiss Franc</li>
			</ul>
		</li>
		<li>Amount is a string</li>
		<li>Everything is in lowercase</li>
		<li>By default, current product price is returned</li>
		<li>Include a date parameter in url to specify a date other than current date?</li>
	</ul>
	<div>
		<code>GET /fee/product</code>
	</div>
	<p>Returns Fees for all products</p>
	<code>
		<pre>
  productFees : [ 
  { 
    "productCode":"p09a",
    "productGroup":"patents",
    "price": {
      "amount":"150.00"
      "vatRate":"0.00",
      "currency":"gbp"
    }
  },
  { 
    "productCode":"p08",
    "productGroup":"patents",
    "price": {
      "amount":"70.00"
      "vatRate":"0.00",
      "currency":"gbp"
    }  
  }
 ] 
</pre>
	</code>
	</p>
	
	<h3>Fee management via Fee Service UI</h3>
	<p>Several other operations for maintaining fee information for products will be supported, protected using appropriate roles in LDAP</p>
	<h4>New product</h4>
	<code>PUT /fee/product/x01a</code>
	<ul>
		<li>Creates a new URI</li>
		<li>Convention recommends using PUT here cos the URI is known, though using POST would enable differentiation between a CREATE and UPDATE request</li>
		<li>All product fee information required</li>
	</ul>
	<h4>Update product</h4>
	<code>PUT /fee/product/x01a</code>
	<ul>
		<li>Updates all product fee information</li>
		<li>Support partial updates?</li>
		<li>If product doesn't exist, returns a 404 error</li>
		<li>All product fee information required</li>
	</ul>
	<h4>Delete products</h4>
	<code>DELETE /fee/product/x01a</code>
	<ul>
		<li>Deletes the designated URI</li>
		<li>Returns a 404 if product doesn't exist</li>
		<li>No body required</li>
	</ul>
	<h3>General error codes</h3>
	<ul>
		<li>200 OK</li>
	</ul>
	<ul>
		<li>400 Bad request</li>
		<li>401 Unauthorised</li>
		<li>404 Not Found</li>
		<li>405 Method not allowed</li>
	</ul>
	<h3>Comments</h3>
	<ol>
		<li>Any other information in the model that is likely to need to be included in ProductFee?, should this be in a separate object?</li>
		<ul>
			<li>Date range for product</li>
		</ul>
		<li>Whether to include product group in uri, for example: GET /fee/product/patents/p09a, disadvantage: consumer has to supply product group in request
			unless 2 uri's are supported for each product, ie - GET /fee/product/patents/p09a and GET /fee/product/p09a, advantage is being able to 'retrieve all patents
			fees' and not having to include product group in Product Fee object.
	</ol>
</body>
</html>
