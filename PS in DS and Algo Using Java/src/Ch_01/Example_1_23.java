/*
 * Name : Rotating an Array by K positions.
 */

package Ch_01;
import java.util.*;

public class Example_1_23 {
	
	// the book solution // a nice trick
	public static void rotateByK(int[] arr, int k) {
		reverseArr(arr, 0, k-1);
		reverseArr(arr, k, arr.length - 1);
		reverseArr(arr, 0, arr.length - 1);
	}

	public static void reverseArr(int[] arr, int start, int end) {
		for(int i = start, j = end; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	// end of solution
	
	// another solution // just to practice
	public static void rotateByK_2(int[] arr, int k) {
		int[] temp = new int[k];
		// put the first k elements in a temporary array
		for(int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}
		// shift the remaining elements to the left
		for(int i = k, j = 0; i < arr.length; i++, j++) {
			arr[j] = arr[i];
		}
		// put the elements of temp in the k positions of arr
		for(int i = arr.length - k, j = 0; i < arr.length; i++, j++) { // (j < k) could also be the condition
			arr[i] = temp[j];
		}
	}
	// end of solution
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// testing the book solution
		int arr[] = {1,2,3,4,5};
		System.out.print("Before : ");
		printArr(arr);
		rotateByK(arr, 2);
		System.out.print("After  : ");
		printArr(arr);
		
		System.out.println();
		
		// testing the another solution
		int arr2[] = {1,2,3,4,5};
		System.out.print("Before : ");
		printArr(arr2);
		rotateByK_2(arr2, 2);
		System.out.print("After  : ");
		printArr(arr2);
	}

}
