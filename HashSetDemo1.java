package sample;

import java.util.HashSet; 

public class HashSetDemo1 {

 
 
    public static void main(String[] args) 
    { 
  
        // Create a HashSet 
        HashSet<Employee> hset = new HashSet<Employee>(); 
  
        for(int i = 0 ; i < 5 ; i++)
        {
        	String name = "name" + i;
            int age = 20+i;
            String companyName =  " Capgemeni";
            
			int employeeIdParameter = i;
			
        	
        	Employee e = new Employee(name, companyName,age, employeeIdParameter);
        	 hset.add( e); 
        	
        }
         
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (Employee temp : hset) { 
            System.out.println(temp); 
        } 
    } 
} 