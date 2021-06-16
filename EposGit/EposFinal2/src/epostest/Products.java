
package epostest;

/**
 *
 * @author Caitl
 */
public class Products {
    private int itemID;
    private String prodName;
    private double cost;
    private int qty;
    
   // Getter methods
    
   public int getitemId()
   {
       return itemID;
   }
   public String getProdName()
   {
       return prodName;
   }
   public double getCost()
   {
       return cost;
   }
   public double getQty()
   {
       return qty;
   } 
    

//setter methods - modify attributes
   
   public void setitemID(int itemIDIn)
   {
       itemID = itemIDIn;
   }
   public void setQty(String prodNameIn)
   {
       prodName = prodNameIn;
   }

   public void setCost(double costIn)
   {
       cost = costIn;
   }
   
   public void setTotal(int qtyIn)
   {
       qty = qtyIn;
   }
   
   
 
   // this is the contructor and must be named the same as the class
   public Products()
           {
               itemID = 0;
               prodName = "";
               cost = 0.0;
               qty = 0;
               
           }
   
    // an verload constructor to take values for every attribute
    // uses setters as well
   
   public Products(int itemIDIn, String prodNameIn, double costIn, int qtyIn)
   {
       itemID = itemIDIn;
       prodName = prodNameIn;
       cost = costIn;
       qty = qtyIn;  
   }
    
}
