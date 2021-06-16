
package epostest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Caitl
 */
public class ProductData {
    
    public ProductData(){
    
    ArrayList<Products> productList = new ArrayList();
    Products apple = new Products(1,"Apple", 0.30,  600);
    Products banana = new Products(2,"Banana", 0.45, 250);
    Products orange = new Products(3,"Orange", 0.60, 120);
    Products potato = new Products(4,"Potato", 0.25, 830);
    Products carrot = new Products(5,"Carrot", 0.15, 920);
    Products onion = new Products(6,"Onion", 0.20, 580);
    Products milk = new Products(7,"Milk", 1.25, 42);
    Products eggs = new Products(8,"Eggs", 1.60, 68);
    Products bread = new Products(9,"Bread", 0.90, 110);
    
    productList.add(apple);
    productList.add(banana);
    productList.add(orange);
    productList.add(potato);
    productList.add(carrot);
    productList.add(onion);
    productList.add(milk);
    productList.add(eggs);
    productList.add(bread);    
    }
        
}
