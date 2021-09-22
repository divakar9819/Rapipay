package basicArray;

public class ArraysWork {
	
	int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};
	int len = arr.length;
	
	/*
	boolean isDuplicate(int item) {
		for(int i=0;i<len;i++) {
			int temp=arr[i];
			for(int j=i+1;j<len;j++) {
				
			}
		}
	}
	*/
	
	
	public int[] getRepeatedValues()
	{
		int duplicateArray[] = new int[len];
		int idx=0;
		// code to return arr[] containing only duplicate values, such as 15,3 etc
		int count = 0;
		for(int i=0;i<len;i++) {
			count = 1;
			int item=arr[i];
			for(int j=i+1;j<len;j++) {
				if(item==arr[j]) {
					count++;
				}
			}
			
			if(count>1) {
				duplicateArray[idx] = arr[i];
				idx++;
			}
		}
		
		return duplicateArray;
		
	}
	
	public short getSum()
	{
		// code to return the total of all values;
		short sum =0;
		for(int i=0;i<len;i++) {
			sum += (short)arr[i];
		}
		return sum;
	}
	
	public static int[] getUniqueValues()
	{
		// code to return arr[] containing all unique values only;
		ArraysWork aw = new ArraysWork();
		int uniqueArray[] = new int[10];
		int idx=0;
		for(int i=0;i<10;i++) {
			int count =1;
			for(int j=i+1;j<10;j++) {
				if(aw.arr[i]==aw.arr[j]) {
					count++;
				}
			}
			
			if(count==1) {
				uniqueArray[idx] = aw.arr[i];
				idx++;
			}
			
		}
		
		
		return uniqueArray;
	}

	
}
