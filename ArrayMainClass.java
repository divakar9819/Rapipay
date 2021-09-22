package basicArray;

public class ArrayMainClass {

	public static void main(String[] args) {
		ArraysWork a1 = new ArraysWork();
		
		
		System.out.print("Duplicate element:");
		int duplicateArray[] = a1.getRepeatedValues();
		for(int ele:duplicateArray) {
			if(ele!=0) {
				System.out.print(ele+" ");
			}
		}
		
		System.out.println();
		
		System.out.println("Total value of array:"+a1.getSum());
		
		System.out.print("Unique element:");
		int uniqueArray[] = a1.getUniqueValues();
		for(int ele:uniqueArray) {
			if(ele!=0) {
				System.out.print(ele+" ");
			}
		}
		
		System.out.println();
		
		
		
		
		

	}

}
