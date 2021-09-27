package basic;

import java.util.Arrays;

public class ContactDetails extends ContactDatabase{
	private String houseNumber;
	private String localityName;
	private String cityName;
	private String stateName;
	private String countryName;
	private long pincode;
	private long mobileNumber;
	private long emailId;
	
	
	
	
	public ContactDetails(String houseNumber, String localityName, String cityName, String stateName,
			String countryName, long pincode, long mobileNumber, long emailId) {
		super();
		this.houseNumber = houseNumber;
		this.localityName = localityName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pincode = pincode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLocalityName() {
		return localityName;
	}
	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getEmailId() {
		return emailId;
	}
	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "ContactDetails [houseNumber=" + houseNumber + ", localityName=" + localityName + ", cityName="
				+ cityName + ", stateName=" + stateName + ", countryName=" + countryName + ", pincode=" + pincode
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}
	
	
	
	
	
	

}
