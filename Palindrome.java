package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // declare a string as madam
		String str1="madam";
	// declare another string
	    String str2="";
	     int length= str1.length();
	
	//Iterate the String in reverse order
				for (int i = length-1; i >=0; i--)
	
	//Add the char into rev
				{
					str2=str2+str1.charAt(i);
									}
	//Compare the original String with the reversed String
				if (str1.equals(str2)){
					
					System.out.println("It is a Palindrome");
					
				}
				else
				{
					System.out.println("It is not Palindrome");
				}
	}

}
