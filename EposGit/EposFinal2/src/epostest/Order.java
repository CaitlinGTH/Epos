/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epostest;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Order {
    private int employeeNo;
    private double total;
//    private int orderCount;
//    private double dailyTotal;
//    private double average;
    

    
   // Getter methods
   public int getEmployeeNo()
   {
       return employeeNo;
   }
   public double getTotal()
   {
       return total;
   } 
//   public int getCount()
//   {
//       return orderCount;
//   } 
   
//   public double getDailyTotal(){
//       
//       dailyTotal += total;
//       return dailyTotal;
//   }
//   
//   public double getAverage(){
//       average = dailyTotal/orderCount;
//       return average;
//   }
//   
    

//setter methods - modify attributes
   public void setEmployeeNo(int employeeNoIn)
   {
       employeeNo = employeeNoIn;
   }
   public void setTotal(double totalIn)
   {
       total = totalIn;
   }
//   public void setCount()
//   {
//       orderCount ++;
//   }
   
   
 
   // this is the contructor and must be named the same as the class
   public Order()
           {
               employeeNo = 0;
               total = 0.0;
//               orderCount = 0;
               
           }
   
    // an verload constructor to take values for every attribute
    // uses setters as well
   
   public Order(int employeeNoIn, double totalIn)
   {
       employeeNo = employeeNoIn;
       total = totalIn;  
//       orderCount = orderCountIn;
   }
   
 
}
