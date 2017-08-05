/*
 * Name : Find the largest sum contiguous subarray.
 */

package Ch_01;
import java.util.*;

public class Example_1_24 {
	
	public int maxSumContSubArr(int[] arr) {
		int maxSoFar = 0, maxEndingHere = 0;
		for(int i = 0; i < arr.length; i++) {
			maxEndingHere += arr[i];
			if(maxEndingHere < 0)
				maxEndingHere  = 0;
			if(maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		
	}

}
