package basicArray;
import java.util.*;

public class EmployeeMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//1
		Employee emp[] = new Employee[3];
		
		//2
		emp[0] = new Employee("Ramesh",350000);
		emp[1] = new Employee("Vijay",450000);
		emp[2] = new Employee("Ajay",560000);
		
		
		//3
		System.out.println("Employee Details");
		System.out.println("************************");
		for(int i=0;i<3;i++) {
			System.out.println(emp[i].toString());
		}
		
		
		//4
		System.out.println("Search employee by id or name");
		System.out.print("Enter Emplyee id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Emplyee Name:");
		String name = sc.nextLine();
		boolean flag = false;
		int idx=-1;
		for(int i=0;i<3;i++) {
			if(emp[i].searchEmployee(emp,id,name)!=-1) {
				flag = true;
				idx = i;
				break;
			}
		}
		
		if(flag) {
			System.out.print("Employee is found and Enter Employee designation:");
			String desi = sc.nextLine();
			emp[idx].setDesignation(desi);
		}
		else {
			System.out.println("Employee of this id or Name is not found!");
		}
		
		
		
		//5
		System.out.println("********Search employee by id****************");
		System.out.print("Enter Emplyee id:");
		int getid = Integer.parseInt(sc.nextLine());
	    flag = false;
	    idx=-1;
		for(int i=0;i<3;i++) {
			if(emp[i].searchEmployeeById(emp,getid)) {
				flag = true;
				idx=i;
				break;
			}
		}
		
		if(flag) {
			System.out.println(emp[idx].toString());
		}
		else {
			System.out.println("This id's Employee is not exits");
		}
		
		//6
		System.out.println("**********Search employee by Designation*****************");
		System.out.print("Enter Emplyee Designation:");
		String designation = sc.nextLine();
		flag = false;
	    idx=-1;
		for(int i=0;i<3;i++) {
			if(emp[i].searchEmployeeByDesignation(emp,designation)) {
				flag = true;
				idx=i;
				break;
			}
		}
		
		if(flag) {
			System.out.println(emp[idx].toString());
		}
		else {
			System.out.println("This Designation Employee is not exits");
		}
			
		

	}

}
