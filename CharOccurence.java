package week2.day1;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str = "welcome to chennai";
		int count[]=new int[256];
		char search ='e';
		char[] charArray1 = str.toCharArray();
		int length = charArray1.length;
		System.out.println(length);	
		for (int i = 0; i <length; i++)
		{
			if(str[i] ==search)
			{
				count+1;	
			}
		*/
		
		String input = "welcome to chennai";
		  char search = 'e';             // Character to search is 'a'.
		  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  }
		
		
				
		}

	


