package basicArray;
import java.util.Random;

/*
Below is the Employee Class Containing 2 arg contructor.
Note: - You cannot add new constructor

Requirement
1) Create EmployeeMainClass containing main method
2) Create 3 Employees through arrays
3) Create method which return all employees and print their values in main class
   through toString()
3) Write code to search Employee by id or name and provide designation through 
   setter method.
4) Write code to return employee based on Id and print their values in main class through toString()
5) Write Code to return employees based on designation and print their values in main class through toString()

 */

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public Employee(String name,int salary) {
		
		Random random = new Random();
		this.name = name;
		this.salary = salary;
        this.id = random.nextInt(1000); // auto generated through random number
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//3
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
	//4
	public int searchEmployee(Employee emp[],int Id,String Name) {
		
		for(int i=0;i<emp.length;i++) {
			
			if(emp[i].id==Id||emp[i].name==Name) {
				return i;
			}
		}
		return -1;
	}
	
	
	//5
	boolean searchEmployeeById(Employee emp[],int Id) {
        for(int i=0;i<emp.length;i++) {
			
			if(emp[i].id==Id) {
				return true;
			}
		}
        
        return false;
	}
	
	
	//6
	boolean searchEmployeeByDesignation(Employee emp[],String Designation) {
        for(int i=0;i<emp.length;i++) {
			
			if(emp[i].designation!=null &&emp[i].designation ==Designation) {
				return true;
			}
		}
        
        return false;
	}
	

}




	
	
	

