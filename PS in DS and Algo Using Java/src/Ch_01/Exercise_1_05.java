/*
 * Find the second largest number in the array.
 */

package Ch_01;

public class Exercise_1_05 {

	public static int secondLargest(int[] arr){
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i] > secondMax)
				secondMax = arr[i];
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,3,1,4,2};
		System.out.println(secondLargest(arr)); // outputs 4
		
		int[] arr2 = {-1,3,-2,4,-5};
		System.out.println(secondLargest(arr2)); // outputs 3
		
		int[] arr3 = {0,0,0,0,0};
		System.out.println(secondLargest(arr3)); // outputs 0
		
		int[] arr4 = {11,3,-2,4,-5}; 
		System.out.println(secondLargest(arr4)); // outputs 4
	}

}
