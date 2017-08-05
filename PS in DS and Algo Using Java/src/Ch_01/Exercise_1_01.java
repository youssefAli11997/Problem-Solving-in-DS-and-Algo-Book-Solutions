/*
 * Find average of all the elements in an array.
 */

package Ch_01;

public class Exercise_1_01 {
	
	// recursive
	public static double findAverage(int[] arr, int index, int sum) {
		if(index == arr.length)
			return sum * 1.0 / arr.length;
		return findAverage(arr, index + 1, sum + arr[index]);
	}
	
	// iterative
	public static double findAverage(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum * 1.0 / arr.length;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,5,1,3};
		System.out.println(findAverage(arr, 0, 0)); // should output 3.0
	}

}
