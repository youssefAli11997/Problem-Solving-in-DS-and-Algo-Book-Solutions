package Ch_14;

import java.util.Scanner;

public class Example_14_01 {
	
	// returns the first occurrence of a pattern in a text, or -1 if not found 
	public static int BruteForceSearch(String text, String pattern){
		int n = text.length();
		int m = pattern.length(); // n > m
		for(int i = 0; i <= n - m; i++){
			int j = 0;
			while(j < m && text.charAt(i + j) == pattern.charAt(j))
				j++;
			
			if(j == m)
				return i; // beginning index of the occurrence
		}
		return -1; // checked the whole text without finding the pattern
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the text : ");
		String text = in.nextLine();
		
		System.out.println("Enter the pattern : ");
		String pattern = in.nextLine();
		
		int indexOfStart = BruteForceSearch(text, pattern);
		int indexOfEnd = indexOfStart + pattern.length() - 1;
		if(indexOfStart == -1)
			System.out.println("Pattern is not found");
		else
			System.out.println("Pattern is found from index " + indexOfStart
					                       								    + " to index " + indexOfEnd);

	}
}