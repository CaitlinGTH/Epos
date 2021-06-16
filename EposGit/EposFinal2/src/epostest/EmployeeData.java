
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
public class EmployeeData {
        
    
    public static void main(String[] args){
        
        ArrayList<Employee> employees = new ArrayList();
        Employee staff1 = new Employee(6688, "Caitlin",  "Higgins", "Pass148", true);
        Employee staff2 = new Employee(6689, "Brian",  "Timlin", "eNtry666", true);
        Employee staff3 = new Employee(6877, "Sean", "Limmond", "jfK2", false);
        Employee staff4 = new Employee(6869, "James", "Smith", "648bCA", false);
        Employee staff5 = new Employee(7001, "Kirsty",  "Lynsey", "passMe", true);
        Employee staff6 = new Employee(7008, "Chloe", "Burn", "568Hi", false);
        
        employees.add(staff1);
        employees.add(staff2);
        employees.add(staff3);
        employees.add(staff4);
        employees.add(staff5);
        employees.add(staff6);

        
        
        UserLogin login = new UserLogin(employees);
        login.setVisible(true);
}
}
