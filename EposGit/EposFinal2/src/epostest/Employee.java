
package epostest;

/**
 *
 * @author Caitl
 */
public class Employee {
    
    private int employeeNo;
    private String firstName;
    private String lastName;
    private String password;
    private boolean manager;
    


    public Employee(){
    //default constructor   
    //if you indlude an overloaded consructor then you must include a default
    }    
    
    
    public Employee(int employeeNoIn, String firstNameIn, String lastNameIn, String passwordIn, boolean managerIn) 
    {

    this.employeeNo=employeeNoIn;
    this.firstName=firstNameIn; 
    this.lastName=lastNameIn;
    this.password=passwordIn;
    this.manager=managerIn;

    }
    
    //setters========================

      public void setManager(boolean managerIn){
        // Accessor method- these guard aginst false data being use for state.
            this.manager=manager;

      }   
    
    public void setFirstName(String firstNameIn){
        // Accessor method- these guard aginst false data being use for state.
        if (!firstNameIn.equals("")){
            this.firstName=firstNameIn;
        }
        
    }
        public void setLastName(String lastNameIn){
         // Accessor method- these guard aginst false data being use for state.
      // boolean flag=false;
         if (!lastNameIn.equals("")){
            this.lastName=lastName;
        //    flag=true;
        }
      //  return flag;
        }
        
        
        
        
        public void setPassword(String passwordIn){
         // Accessor method- these guard against false data being use for state.
        if (!passwordIn.equals("")){
            this.password=passwordIn;
        }
        }
        
        public void setEmployeeNo(int employeeNoIn) {
            
        if (employeeNoIn > 100000){
            this.employeeNo=employeeNoIn;
        }
            
    
    }
    
      //===========getters========================
    
       public String getFirstName(){
        // Accessor method- these guard aginst false being use for state.
            return this.firstName;
    }
              public String getLastName(){
        // Accessor method- these guard aginst false being use for state.
            return this.lastName;
    }
         public String getPassword(){
        // Accessor method- these guard aginst false being use for state.
            return this.password;
    }
              public int getEmployeeNo(){
        // Accessor method- these guard aginst false being used for state.
            return this.employeeNo;
    }
              
       public boolean getManager(){
        // Accessor method- these guard aginst false being used for state.
            return this.manager;
    }         
       
       
    @Override
       public String toString(){

           StringBuilder theStringVersionOfTheUser= new StringBuilder();
           
           theStringVersionOfTheUser.append(this.employeeNo).append(" , ");
           theStringVersionOfTheUser.append(this.firstName ).append(" , ");
           theStringVersionOfTheUser.append( this.lastName ).append(" , ");
           theStringVersionOfTheUser.append( this.manager ).append(" , ");
           theStringVersionOfTheUser.append(this.password );
           
           return theStringVersionOfTheUser.toString();
       }
       

       

}
