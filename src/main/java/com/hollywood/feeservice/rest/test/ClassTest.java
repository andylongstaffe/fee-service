package com.hollywood.feeservice.rest.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.hollywood.feeservice.rest.model.Price;
import com.hollywood.feeservice.rest.model.impl.PriceImpl;

public class ClassTest {

  public static void main(String[] args)  {
    // TODO Auto-generated method stub
      
      try {
        Class<?> clazz = PriceImpl.class; 
        Constructor cons = clazz.getConstructor(String.class, String.class, String.class);
         Price price = (Price) cons.newInstance("100.00", "0.00", "gbp");
         System.out.println(price);
         
        
      } catch (InstantiationException | IllegalAccessException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (NoSuchMethodException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SecurityException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IllegalArgumentException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  }

}
