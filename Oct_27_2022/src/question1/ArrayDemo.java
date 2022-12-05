package question1;

public class ArrayDemo {

	void setIntegerArray(int[] array) {
		for(int i=0; i<array.length; i++) {
		System.out.println("Array Elements at index: " +i+ " are: "+array[i]);
		}
	}
		
	int[] manipulateIntegerArray(int[] Array) {
		
		System.out.println("After adding the 5 at every index the array is listed bellow: ");
		int[] arr = new int[Array.length];
		for(int i=0; i<Array.length; i++) {	
			arr[i] = Array[i]+5;
			System.out.println("Array " +Array[i]+ " Manipulated at index " +i+ " are: "+arr[i]);
		}
		return arr;
	}
		
	public static void main(String[] args) {
			
		ArrayDemo obj1=new ArrayDemo();
		int arr[]= {10,20,30,40,50};
		obj1.setIntegerArray(arr);
	    obj1.manipulateIntegerArray(arr);

	}
}
	