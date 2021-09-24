package basic;
import java.util.Scanner;

public class userCodeClass {
	
	static deviceRecords deviceRecord = new deviceRecords(); 
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		userCodeClass ucc = new userCodeClass();
		
		System.out.println(" ------- Device ----");
		System.out.println("1. Insert New Device ");
		System.out.println("2. Search Device based on ModelNumber:");
		System.out.println("3. Print All Devices ");
		System.out.println("4. Print Devices within Price Range  ");
		System.out.println("5. Filter Device based on Price Range and BrandName ");
		System.out.println("6. Apply avgRating filter on Filtered Devices ");
		System.out.println("0. EXIT ");
		
		while(true)
		{
			
			System.out.println("\n\n Enter Choice :-  ");
			int userChoice = Integer.parseInt(ucc.sc.nextLine());
		
			
			switch (userChoice) {
			case 1:
				ucc.addDevice();
				break;
				
			case 2:
				ucc.searchDeviceBasedOnModelNumber();
				break;
				
			case 3:
				deviceRecord.printAllDevice();
				break;
				
			case 4:
				ucc.printDevicePriceRange();
				break;
				
			case 5:
				ucc.filterDevice();
				break;
				
			case 6:
				ucc.filter();
				
			case 7:
				System.exit(0);
				break;
				
			

			default:
				break;
			}
			
		}
		
		

	}
	
	public void addDevice() {
		System.out.println("-------Enter Employee Details---------");
		System.out.println("Enter device Name:");
		String deviceName = sc.nextLine();
		System.out.println("Enter device Cost:");
		int cost = Integer.parseInt(sc.nextLine());
		System.out.println("Enter device Average Ratings:");
		int avgRating =Integer.parseInt(sc.nextLine());
		System.out.println("Enter device Brand Name:");
		String brandName = sc.nextLine();
		Device device = new Device(deviceName,cost,avgRating,brandName);
		deviceRecord.insertDevice(device);
		
	}
	
	public void searchDeviceBasedOnModelNumber() {
		System.out.println("Enter device Model Number:");
		String modelNumber = sc.nextLine();
		if(deviceRecord.searchDeviceBasedOnModelNumber(modelNumber)) {
			System.out.println("Device is exists");
		}
		else {
			System.out.println("Device is not exists");
		}
	}
	
	public void printDevicePriceRange() {
		System.out.println("Enter device Price:");
		int cost = Integer.parseInt(sc.nextLine());
		deviceRecord.printDeviceWithinPriceRange(cost);
	}
	
	public void filterDevice() {
		System.out.println("Enter device Price:");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("Enter device Brand Name:");
		String brandName = sc.nextLine();
		
		Device tempArray[] = deviceRecord.filterDevice(price,brandName);
		for(int i=0;i<tempArray.length;i++) {
			System.out.println("Name-"+tempArray[i].getDeviceName()+"  AvgRating-"+
		                        tempArray[i].getAvgRating());
		}
	}
	
	public void filter() {
		System.out.println("Enter device Rating:");
		int rating = Integer.parseInt(sc.nextLine());
		Device tempArray[] = deviceRecord.filterDeviceAverageRating(rating);
		for(int i=0;i<tempArray.length;i++) {
			System.out.println("Name-"+tempArray[i].getDeviceName()+"  AvgRating-"+
		                        tempArray[i].getCost()+" Brand Name "+tempArray[i].getBrandName());
		}
		
	}

}
