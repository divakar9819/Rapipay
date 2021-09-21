package A1;
import java.util.Scanner;

public class bankInfo {
	static float CA  =0.0f;
	static float EI;
	static float I ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		
		
		for(int i=0;i<year;i++) {
			System.out.print("Enter deposit amount:-");
			int depositAmount = sc.nextInt();
			EI = CA+depositAmount;
			I = EI*9/100.0f;
			CA = EI + I;
			
			System.out.println("Interest is "+EI+"*0.09: "+I+" amount at end of year is: "+CA);
		}
		
		

	}

}
