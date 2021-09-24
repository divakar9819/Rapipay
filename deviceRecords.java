package basic;

public class deviceRecords {
	
	
	Device arr[] = new Device[100];
	
	int indexPosition=0;
	
	//method to add device
	public  String insertDevice(Device device) {
		String modelNumber =null;
		if(device!=null) {
			arr[indexPosition++] = device;
		}
		
		return modelNumber;
	}
	
	//method to get all device
	public Device[] getAllDevice() {
		Device tempArray[] = new Device[indexPosition];
		for(int i=0;i<indexPosition;i++) {
			tempArray[i] = arr[i];
		}
		
		return tempArray;
	}
	
	//search device based on modelNumber
	boolean searchDeviceBasedOnModelNumber(String modelNumber) {
		for(int i=0;i<indexPosition;i++) {
			if(arr[i].getModelNumber()==modelNumber) {
				return true;
			}
		}
		return false;
	}
	
	//method to print all device
	public void printAllDevice() {
		Device tempArray[] = getAllDevice();
		System.out.println("--------------Device Information---------------");
		for(int i=0;i<tempArray.length;i++) {
			System.out.println(tempArray[i].toString());
		}
		
	}
	
	//4) Print Devices within Price Range (entered by user)
	void printDeviceWithinPriceRange(int price) {
		for(int i=0;i<indexPosition;i++) {
			if(arr[i].getCost()<=price) {
				System.out.println("Device Name:"+arr[i].getDeviceName()+" Device avarege Rating "
						+arr[i].getAvgRating()+" Model Number "+arr[i].getModelNumber());
			}
		}
	}
	
	//5)a. Filter Device based on Price Range and BrandName
	 //  5.b) Apply avgRating filter on Filtered Devices.
	
	public Device[] filterDevice(int priceRange,String brandName) {
		Device tempArray[] = new Device[indexPosition];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getCost()>=priceRange && arr[i].getCost()<=priceRange && arr[i].getBrandName().equals(brandName)){
				tempArray[idx++] = arr[i];
				
			}
		}
		return tempArray;
		
	}
	
	//5.b
	
	public Device[] filterDeviceAverageRating(int avgRating) {
		Device tempArray[] = new Device[indexPosition];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getAvgRating()>=avgRating){
				tempArray[idx++] = arr[i];
				
			}
		}
		return tempArray;
	}
	

}
