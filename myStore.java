package basic;

public class myStore {

	public static void main(String[] args) {
		
		laptop dell = new laptop();
		laptop hp = new laptop();
		laptop apple = new laptop();
		
		dell.setBrandName("Dell");
		dell.setCost(35000);
		dell.setRamSize(4);
		
		hp.setBrandName("HP");
		hp.setCost(65000);
		hp.setRamSize(8);
		
		apple.setBrandName("Apple");
		apple.setCost(100000);
		dell.setRamSize(8);
		
		System.out.println("Dell laptop");
		System.out.println("****************************");
		System.out.println(dell.toString());
		
		System.out.println("HP laptop");
		System.out.println("****************************");
		System.out.println(hp.toString());
		
		System.out.println("Apple laptop");
		System.out.println("****************************");
		System.out.println(apple.toString());
		
		
		

	}
	
	

}
