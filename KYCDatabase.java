package basic;

public class KYCDatabase {

	KYCVerification kycArray[] = new KYCVerification[5];
	static int indexKYC = 0;
	
	public void insertKYCDetails(KYCVerification kyc){
		if(kyc!=null) {
			kycArray[indexKYC++] = kyc;
			System.out.println("KYC Details Inserted successfully");
		}
	}
	
	
	public int searchByKYCDetails() {
		return 0;
	}
	
	void printUserKYCDetails() {
		for(int i=0;i<indexKYC;i++) {
			System.out.println(kycArray[i].toString());
		}
	}
	
}
