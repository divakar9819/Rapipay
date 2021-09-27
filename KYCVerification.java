package basic;

import java.util.Arrays;

public class KYCVerification {
	private String penNumber;
	private long aadharNumber;
	private String documentType;
	private String documentNumber;
	
	
	
	
	public KYCVerification(String penNumber, long aadharNumber, String documentType, String documentNumber) {
		super();
		this.penNumber = penNumber;
		this.aadharNumber = aadharNumber;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}
	
	public String getPenNumber() {
		return penNumber;
	}
	public void setPenNumber(String penNumber) {
		this.penNumber = penNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	@Override
	public String toString() {
		return "KYCVerification [penNumber=" + penNumber + ", aadharNumber=" + aadharNumber + ", documentType="
				+ documentType + ", documentNumber=" + documentNumber + "]";
	}
	
	
	
	
	
	
	
	

}
