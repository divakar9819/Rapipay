package basic;

public class ContactDatabase {

	//Contact Details Database
		ContactDetails contactDetailsArray[] = new ContactDetails[5];
		static int indexContact = 0;
		
		
		
		public void insertContactDetails(ContactDetails conDetails){
			if(conDetails!=null) {
				contactDetailsArray[indexContact++] = conDetails;
				System.out.println("Contact Details Inserted successfully");
			}
		}
		
		
		public int searchMobileNumber(long oldNumber) {
			for(int i=0;i<indexContact;i++) {
				if(contactDetailsArray[i].getMobileNumber()==oldNumber) {
					return i;
				}
			}
			return -1;
		}
		
		//method for updating mobile number
		public void updateNumber(int idx,long newNumber) {
			contactDetailsArray[idx].setMobileNumber(newNumber);
			System.out.println("Your mobile number change successfully-------");
		}
		
		
		public int searchEmailId(long oldEmailId) {
			for(int i=0;i<indexContact;i++) {
				if(contactDetailsArray[i].getEmailId()==oldEmailId) {
					return i;
				}
			}
			return -1;
		}
		
		//method for updating Email Id
		public void updateEmailId(int idx,long newEmail) {
			contactDetailsArray[idx].setEmailId(newEmail);
			System.out.println("Your email id change successfully-------");
		}
		
		
		
		void printUserContactDetails() {
			for(int i=0;i<indexContact;i++) {
				System.out.println(contactDetailsArray[i].toString());
			}
		}
		
		
}
