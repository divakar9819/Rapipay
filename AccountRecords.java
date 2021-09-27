package basic;

public class AccountRecords extends Account {
	
	Account arr[] = new Account[5];
	static int indexPosition =0;
	
	public void insertAccountDetails(Account acc) {
		if(acc!=null) {
			arr[indexPosition++] = acc;
			System.out.println("hiii");
		}
	}
	
	public void printAccountDetails() {
		System.out.println("----------Users Account Details------");
		System.out.println(indexPosition);
		for(int i=0;i<indexPosition;i++) {
			/*
			System.out.println("Account Number-:"+arr[i].getAccountNumber());
			System.out.println("username-:"+arr[i].getUsername());
			System.out.println("password-:"+arr[i].getPassword());
			System.out.println("balance-:"+arr[i].getBalance());
			System.out.println("cashback-:"+arr[i].getCashback());
		*/
			
			System.out.println(arr[i].toString());
			
			
		}
	}
	

}
