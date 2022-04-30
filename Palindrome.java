package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="madam";
		String newstring = "";
		//int length =str.length();
		for (int i = str.length() -1; i >=0; i--)
		{
			newstring =newstring+str.charAt(i);
		}
		
		if(str.equals(newstring))
		{
		System.out.println("The string " + newstring+ " is palindrome ");	
		}
		

	}

}
