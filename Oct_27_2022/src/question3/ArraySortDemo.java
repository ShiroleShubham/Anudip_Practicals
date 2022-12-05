package question3;

public class ArraySortDemo {
	
	void sortArray(double[] array) {
		
		for(int i=0; i<array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] < array[j]) {    
					double temp = array[i];    
					array[i] = array[j];    
					array[j] = temp;
				}
           	} 
			
			System.out.println("Array Elements in Descending Order at index: "+i+ " is: "+array[i]);
		}
	}
	public static void main(String[] args) {
		
		ArraySortDemo obj=new ArraySortDemo();
		double[] arr= {10.1,15.5,6.03,20.4,12.8};
		obj.sortArray(arr);	
		}
}