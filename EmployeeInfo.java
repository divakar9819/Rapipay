package A1;
import java.util.*; 

public class EmployeeInfo {
	
	private String name;
	private char gender;
	private double yearOfExp;
	private String designation;
	private double basicSalary;
	private String status;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(double yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double promoteExp() {
		if(this.designation =="ASE") {
			this.designation = "ITA";
			this.basicSalary = this.basicSalary + this.basicSalary*0.05;
			
		}
		
		else if(designation=="ITA") {
			this.designation = "AST";
			this.basicSalary = this.basicSalary + this.basicSalary*0.08;
			
		}
		else if(this.designation == "AST") {
			this.designation = "ASC";
			this.basicSalary = this.basicSalary + this.basicSalary*0.10;
		}
		else{
			System.out.println("ASC is the top designation");
		}
		
		return this.basicSalary;
	}
	
	public void applyForLWP() {
		this.status = "Inactive";
		this.basicSalary = 0.0;
	}
	
	public void display() {
		System.out.println("Employee details");
		System.out.println("********************************************");
		System.out.println("Employee Name:"+this.name);
		System.out.println("Employee gender:"+this.gender);
		System.out.println("Empoyee experience:"+this.yearOfExp);
		double temp = promoteExp();
		System.out.println("Employee designation:"+this.designation);
		System.out.println("Employee basicSalary:"+temp);
		
		
	}
	

	@Override
	public String toString() {
		return "EmployeeInfo [name=" + name + ", gender=" + gender + ", yearOfExp=" + yearOfExp + ", designation="
				+ designation + ", basicSalary=" + basicSalary + ", status=" + status + "]";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter employee gender: ");
		char gender = sc.next().charAt(0);
		
		
		
		EmployeeInfo e1 = new EmployeeInfo();
		
		e1.setName(name);
		e1.setGender(gender);
		
		System.out.print("Enter employee experience: ");
		double exp = sc.nextDouble();
		e1.setYearOfExp(exp);
		if(e1.getYearOfExp()<3) {
			e1.setDesignation("ASE");
			e1.setBasicSalary(10000.0);
		}
		else {
			e1.setDesignation("ITA");
			e1.setBasicSalary(15000.0);
		}
		
		e1.setStatus("Active");
		
		e1.display();
				
		

	}

}
