/*
 * Given an array with value 0 or 1, write a program to segregate 0 on the left side and 1 on
 * the right side.
 * 
 * NOTE : this solution also works for problem 1_12
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
	
	// another solution
	public static void segregate2(int[] arr) {
		for(int s = 0, e = arr.length - 1; s < e; ) {
			if(arr[e] == 0 && arr[s] == 0)
				s++;
			else if(arr[e] == 0 && arr[s] == 1){
				arr[e] = 1;
				arr[s] = 0;
				s++;
				e--;
			}
			
			else if(arr[s] == 1 && arr[e] == 1)
				e--;
			else if(arr[s] == 1 && arr[e] == 0){
				arr[e] = 1;
				arr[s] = 0;
				s++;
				e--;
			}
			else{
				s++;
				e--;
			}
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
		
		System.out.println();
		
		int[] arr2 = {1,0,1,0,0,1,0,1,1,0};
		printArr(arr2);
		segregate2(arr2);
		printArr(arr2);
	}

}
