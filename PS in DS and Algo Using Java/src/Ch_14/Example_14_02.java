package Ch_14;

import java.util.Scanner;

public class Example_14_02 {
	
	// returns the first occurrence of a pattern in a text, or -1 if not found 
	public static int RobinKarp(String text, String pattern){
		int patternHash = 0, textHash = 0, powm = 1, prime = 101;
		int n = text.length();
		int m = pattern.length();
		
		for(int i = 0; i < m-1; i++)
			powm = (powm << 1)  % prime;
		
		// calculate the hash value for the pattern
		// and text prefix of length m
		for(int i = 0; i < m; i++){
			patternHash = ((patternHash << 1) + pattern.charAt(i)) % prime;
			textHash = ((textHash << 1) + text.charAt(i)) % prime;
		}
		
		for(int i = 0; i < n - m; i++){
			if(textHash == patternHash){
				int j = 0;
				while(j < m && text.charAt(i + j) == pattern.charAt(j))
					j++;
				if(j == m)
					return i;
			}
			textHash = (((textHash - pattern.charAt(i) * powm) << 1) + text.charAt(i+m)) % prime;
			if(textHash < 0)
				textHash += prime;
		}
		return -1; // not found
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the text : ");
		String text = in.nextLine();
		
		System.out.println("Enter the pattern : ");
		String pattern = in.nextLine();
		
		int indexOfStart = RobinKarp(text, pattern);
		int indexOfEnd = indexOfStart + pattern.length() - 1;
		if(indexOfStart == -1)
			System.out.println("Pattern is not found");
		else
			System.out.println("Pattern is found from index " + indexOfStart
					                       								    + " to index " + indexOfEnd);
	}
}