package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Declare string input	
		String test = "changeme";
		
		// String to charArray
		char[] ch = test.toCharArray();
		
		//Traverse each char using loop
		for (int i=0;i<test.length();i++)
		{
			
			// odd index within the loop - mod operator
			if (i%2!=0)
			{
						System.out.print(Character.toUpperCase(ch[i]));
			}
		
		else {
			System.out.print(ch[i]);
	}
		}
}
}
