
import java.util.Scanner;
/*
class taxCalculater1
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary:- ");
		int salary = sc.nextInt();
		float tax =1;
		int taxRate =0;
		if(salary>1000000){
			taxRate = 20;
			tax = (float)(salary*0.20);
		}

		System.out.println("Salary: "+salary+" taxRate @:"+taxRate+"%"+" tax: "+tax);
	}
}
*/

// Enter Basic Salary 
// add HRA :- @15 of Basic
// add DA :- 60% of Basic 
// tax : below 500k :- 0%'
// 500,001 - 10,00,000 :- 20%
// 10                  := 30%

class taxCalculater
{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary:-");
		int basicSalary = sc.nextInt();
		float hra = 1.0f;
		float da = 1.0f;
		float tax = 1.0f;

		hra = (float)(0.15*basicSalary);
		da =  (float)(0.6*basicSalary);
		int taxRate = 0;
		if(basicSalary<500000){
			taxRate = 0;
		}
		else if(basicSalary<=500001 && basicSalary>=1000000){
			taxRate = 20;
		}
		else {
			taxRate = 30;
		}

		tax = (float)basicSalary*taxRate/100.0f;

		System.out.println("BasicSalary:"+basicSalary+" HRA:"+hra+" DA:"+da+" taxRate:"+taxRate+" tax:"+tax);

	}
}

class star
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row no. ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}

class triangle
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row no. ");
		int n = sc.nextInt();
		int star = 1;
		int space = n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}

			for(int k=1;k<=star;k++){
				System.out.print("*");
			}

			star+=2;
			space--;
			System.out.println();
		}
	}
}
