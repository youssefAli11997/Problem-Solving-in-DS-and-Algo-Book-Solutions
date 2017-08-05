package Ch_01;

public class Exercise_1_01 {

	public static int findAverage(int[] arr, int index, int sum){
		if(index == arr.length)
			return sum / arr.length;
		return findAverage(arr, index + 1, sum + arr[index]);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,5,1,3};
		System.out.println(findAverage(arr, 0, 0)); // should output 3
	}

}
