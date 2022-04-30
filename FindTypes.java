package week2.day1;

import java.util.Arrays;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray = test.toCharArray();
		int length = charArray.length;
		System.out.println(length);
		//for(int i=0;i<length;i++)
			for(char i :charArray)
		{
			if(Character.isDigit(i))
			{
				num++;
			}
			else if(Character.isLetter(i))
			{
				letter++;
			}
			else if(Character.isSpaceChar(i))
			{
				space++;
			}else
			{
				specialChar++;
			}
		}
		
		System.out.println("letter is " + letter);
		System.out.println("space is " + space);
		System.out.println("num is " + num);
		System.out.println("specialChar is " + specialChar);
		
		/*String name ="bharathi";
		char[] array = name.toCharArray();
		Arrays.sort(array);
		String sorted = new String(array);
		System.out.println(sorted);*/
	}

}
