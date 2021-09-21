package A1;
import java.util.Scanner;

public class employee {
	
	float hr_pay;
	int hr_reg;
	int hr_over;
	
	final int fixAmount = 500;
	
	public void setData(int hr_reg,int hr_over) {
		this.hr_reg = hr_reg;
		this.hr_over = hr_over;
	}
	
	public float calculateSalary() {
		
		this.hr_pay = fixAmount + this.hr_over*fixAmount*1.5f;
		return this.hr_pay;
	}
	
	public void display() {
		System.out.println("Total salary is: "+this.hr_pay);
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee working hour: ");
		int rh = sc.nextInt();
		int oh = sc.nextInt();
		employee e1 = new employee();
		e1.setData(rh,oh);
		e1.calculateSalary();
		e1.display();
		
	}

}
