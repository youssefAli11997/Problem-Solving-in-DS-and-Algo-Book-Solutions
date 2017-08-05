/*
 * Given an array with value 0 or 1, write a program to segregate 0 on the left side and 1 on
 * the right side.
 */

package Ch_01;

public class Exercise_1_08 {
	
	public static void segregate(int[] arr) {
		// count how many zeros and how many ones are there
		// assuming it has only zeros and ones as stated in the problem 
		int zeros = 0, ones = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				zeros++;
			else
				ones++;
		}
		// overwrite arr
		for(int i = 0; i < arr.length; i++) {
			if(i < zeros)
				arr[i] = 0;
			else
				arr[i] = 1;
		}
	}
	
	public static void printArr(int[] arr) {
		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {1,0,1,0,0,1,0,1,1,0};
		printArr(arr);
		segregate(arr);
		printArr(arr);
	}

}
