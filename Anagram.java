package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1= "stops";
		String text2="potss";
		boolean status;
		if(text1.length()==text2.length())
		{
			System.out.println(" length match");
		}
				
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		status =Arrays.equals(charArray1, charArray2);
		if(status)
		{
			System.out.println("Both the strings are anagrams");
		}
		else
		{
			System.out.println("Not anagrams");
		}
		
		
	}

}
