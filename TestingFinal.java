/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Toshiba
 */
public class TestingFinal {
  public static void main(String []args){
      float ff = 67.0f;
      if(ff>=0 && ff<=34.0){
          System.out.println("1");
      }
      else if(ff>=35.0 && ff<=60.0){
          System.out.println("tto");   
         }
     else if(ff>=60.1 && ff<=100.0){
            System.out.println("three"); 
         }
         else{
             System.out.println("four");
         }
  }  
}
