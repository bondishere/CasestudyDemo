package sample;
import java.util.Date;

public class Employee
{
    private String lastname;
    private double salary;
    int age;
    private String firstname;
    private String middleName;
    private Date dateOfJoining;
    private int id;
    
    protected int stockOption;
    
    private String address;
    
    
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public Employee(String p_lastName , String p_firstName , double p_salary, 
            int  p_id)
    {
        lastname  = p_lastName;
        firstname  = p_firstName;
        salary  = p_salary;
        id  = p_id;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void addBonus(double percentage)
    {
        salary = salary + salary * percentage/100;
    }
    
    
    public void printAllInfo()
    {
        System.out.println(" name and salary :" + this.getLastname() + " : and salary: "+ this.getSalary());
    }
  
    
    public boolean equals(Object obj)
    {
        
        if (this == obj)
        {   
            return true;
        }
        
        if (obj instanceof Employee)
        {   
        	Employee e1 = (Employee) obj;
            if (this.lastname.equals(e1.getLastname()))
            {   
                return true;
            }
        
        }
        return false;
    }

    public int hashCode()
    {
        return this.getLastname().hashCode() + this.id;
    }


    
}

class PermanentEmployee extends Employee
{
    
    public PermanentEmployee(String p_lastName , String p_firstName , double p_salary, 
            int  p_id , int stockOption)
    {
        super( p_lastName ,  p_firstName ,  p_salary, 
                p_id);
       
        this.stockOption = stockOption;
        
       

    }
    public double getSalary()
    {
        double value = stockOption *20;
        
        double totalCtc = super.getSalary() + value;
         return totalCtc;
    }
    
    
}

 



