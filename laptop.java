package basic;

public class laptop {
	private int cost;
	private String brandName;
	private int ramSize;
	
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
	@Override
	public String toString() {
		return "laptop [cost=" + cost + ", brandName=" + brandName + ", ramSize=" + ramSize + "]";
	}
	
	
	
	

}
