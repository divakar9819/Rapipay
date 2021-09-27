package basic;
import java.util.*;

public class Application {
	
	static Records record = new Records();
	static ContactDatabase cdb = new ContactDatabase();
	static KYCDatabase kycdb = new KYCDatabase();
	
	Account acc = new Account();
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Application application = new Application();
		
		while(true) {
			System.out.println("--------Welcome-----------");
			System.out.println("1. Enter users Details");
			System.out.println("2. Deposite");
			System.out.println("3.Withdrawal");
			System.out.println("4.Print users Account Details");
			System.out.println("5.Print users Contact Details");
			System.out.println("6.Print users KYC Details");
			System.out.println("7.Print User Balance");
			System.out.println("8.Change Mobile Number");
			System.out.println("9.Chance Email Id");
			
			//String temp = sc.nextLine();
			int userChoice = Integer.parseInt(sc.nextLine());
			switch(userChoice) {
			case 1:
				application.submitUserDetails();
				break;
				
			case 2:
				application.doDepositeOperation();
				break;
				
			case 3:
				application.doWithdrawalOperation();
				break;
				
			case 4:
				application.printUserAllDetails();
				break;
				
			case 5:
				cdb.printUserContactDetails();
				break;
			case 6:
				kycdb.printUserKYCDetails();
				break;
			case 7:
				application.printBalance();
				break;
				
			case 8:
				application.changeMobileNumber();
				break;
				
			case 9:
				application.changeEmailId();
				break;
				
			case 0:
				System.exit(0);
				break;
				
			default:
				break;
		   }
			
		}
		
		
	}
	
	
	public void submitUserDetails() {
		
		System.out.println("--------Usre Details--------");
		System.out.println("1.Enter KYC Details.");
		System.out.println("2.Enter contact Details.");
		System.out.println("3.Enter Account Details.");
		System.out.println("Enter your choice");
		int userChoice = sc.nextInt();
		Application application = new Application();
		
		switch(userChoice) {
			case 1:
				application.addKYCDetails();
				break;
				
			case 2:
				application.addContactDetails();
				break;
			case 3:
				application.addAccountDetails();
				break;
				
				
			default:
					break;
				
				
		}
		
		
	}
	
	public void addKYCDetails() {
		System.out.println("-----------User KYC Details-------------");
		System.out.println("Enter Pen Number");
		String penNumber = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Aadhar Number");
		long aadharNumer = Long.parseLong(sc.nextLine());
		System.out.println("Enter Document Type");
		String documentType = sc.nextLine();
		System.out.println("Enter Document Number");
		String documentNumber = sc.nextLine();
		
		KYCVerification kyc = new KYCVerification(penNumber,aadharNumer,documentType,documentNumber);
		kycdb.insertKYCDetails(kyc);
		
		
		
		
		
	}
	
	public void addContactDetails() {
		System.out.println("----------User Contact details-------------");
		System.out.println("Enter House Number");
		String houseNumber = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Locality Name");
		String localityName = sc.nextLine();
		System.out.println("Enter city Name");
		String cityName = sc.nextLine();
		System.out.println("Enter state name");
		String stateName = sc.nextLine();
		System.out.println("Enter country Name");
		String countryName = sc.nextLine();
		System.out.println("Enter Pin code");
		long pincode = Long.parseLong(sc.nextLine());
		System.out.println("Enter Mobile Number");
		long mobileNumber = Long.parseLong(sc.nextLine());
		System.out.println("Enter Email Id");
		long emailId = Long.parseLong(sc.nextLine());
		
		ContactDetails contactDetail = new ContactDetails(houseNumber,localityName,cityName,stateName,countryName,pincode,mobileNumber,emailId);
		cdb.insertContactDetails(contactDetail);
		
	}
	
	public void addAccountDetails() {
		System.out.println("-------------Enter Account Details----------------");
		System.out.println("Enter Account Number.");
		//long accountNumber = Long.parseLong(sc.nextLine());
		long accountNumber = sc.nextLong();
		System.out.println("Enter Account userName.");
		String username = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Account Password.");
		String password = sc.nextLine();
		System.out.println("Enter Account balance.");
		int balance = Integer.parseInt(sc.nextLine());
		//System.out.println(username+password);
		Account account = new Account(accountNumber,username,password,balance);
		record.insertAccountDetails(account);
		
	}
	
	public void doDepositeOperation() {
		
		System.out.println("Enter your account number");
		//String temp = sc.nextLine();
		long accountNumber = Long.parseLong(sc.nextLine());
		int index = record.searchUserByAccountNumber(accountNumber);
		if(index!=-1) {
			System.out.println("Enter amount you want to deposite-----");
			int amount = Integer.parseInt(sc.nextLine());
			amount = amount+record.arr[index].getBalance();
			record.updateAccountBalance(index,amount);
		}
		else {
			System.out.println("Your account is not exits------");
		}
		
	}
	
	public void doWithdrawalOperation() {
		System.out.println("Enter your account number----");
		//long accountNumber = sc.nextLong();
		long accountNumber = Long.parseLong(sc.nextLine());
		int index = record.searchUserByAccountNumber(accountNumber);
		if(index!=-1) {
			System.out.println("Enter amount you want to Withdrawal-------");
			int amount = Integer.parseInt(sc.nextLine());
			int currentAmount = record.arr[index].getBalance();
			if(currentAmount-5000<amount) {
				System.out.println("Soory!Your Amount is low!");
			}
			else {
				int cashBack =(int)0.01*amount;
				record.arr[index].setCashback(cashBack);
				record.arr[index].setBalance(cashBack+currentAmount-amount);
			}
			
		}
		else {
			System.out.println("Sorry!Your Account is not exits!");
		}
		
	}
	
	public void  printUserAllDetails() {
		record.printAccountDetails();
	}
	
	public void printBalance() {
		System.out.println("Enter your account number----");
		long accountNumber = sc.nextLong();
		int index = record.searchUserByAccountNumber(accountNumber);
		if(index!=-1) {
			System.out.println("Your Balance is -: "+record.arr[index].getBalance());
		}
		else {
			System.out.println("Your account is not exits------");
		}
	}
	
	public void changeMobileNumber() {
		System.out.println("-------Welcome----------");
		System.out.println("Plese Enter your old mobile Number-:");
		long oldNumber = sc.nextLong();
		int idx = cdb.searchMobileNumber(oldNumber);
		if(idx!=-1) {
			System.out.println("Please enter your new Mobile Number-:");
			long newNumber = sc.nextLong();
			cdb.updateNumber(idx,newNumber);
			
		}
		else {
			System.out.println("Sorry! You enter wrong mobile number");
		}
	}
	
	public void changeEmailId() {
		System.out.println("-------Welcome----------");
		System.out.println("Plese Enter your old email id-:");
		long oldEmail = sc.nextLong();
		int idx = cdb.searchEmailId(oldEmail);
		if(idx!=-1) {
			System.out.println("Please enter your new email id -:");
			long newEmail = sc.nextLong();
			cdb.updateNumber(idx,newEmail);
			
		}
		else {
			System.out.println("Sorry! You enter wrong Email Id!!!!!!!!!!!!!!");
		}
		
	}
	
	
	
	

}
