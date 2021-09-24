package basic;

import java.util.Random;

public class Device {
	private String deviceName;
	private String modelNumber; // as Id , should be auto-generated combination of char or numbers (6 chars) 
	// such as abc123 , xyz343, bjb543 
	private int cost;
	private int avgRating;
    private String brandName;
	
	public Device(String deviceName, int cost, int avgRating,String brandName) {
		this.deviceName = deviceName;
		this.cost = cost;
		this.avgRating = avgRating;
        this.brandName = brandName;
        this.modelNumber = getAlphaNumericString(); //generate random alphaNumeric number
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", modelNumber=" + modelNumber + ", cost=" + cost + ", avgRating="
				+ avgRating + ", brandName=" + brandName + "]";
	} 
	
	static String getAlphaNumericString(){
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(3);
  
        for (int i = 0; i < 3; i++) {
  
            int index = (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        
        Random random = new Random();
        return sb.toString()+random.nextInt(1000);
    }

}
