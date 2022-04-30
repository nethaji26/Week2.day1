package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] strArr = test.split(" ");
		String rev = "";
		String output="";
		for(int i=0;i<strArr.length;i++)
		{
			if((i+1)%2==0)
			{
				char[] charArray = strArr[i].toCharArray();
				for(int j = charArray.length-1; j>=0; j-- )
				{
					 rev = rev + charArray[j];
					
				}
				output = output + rev + " ";
			}
			else
			{
				output = output + strArr[i]+ " ";
			}

			}
			
			System.out.println(output);	
		}

	}
		


