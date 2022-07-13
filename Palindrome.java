package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // declare a string as madam
		String a="madam";
	// declare another string
	    String b="";
	     int length= a.length();
	
	//Iterate the String in reverse order
				for (int i = length-1; i >=0; i--)
	
	//Add the char into rev
				{
					b=b+a.charAt(i);
									}
	//Compare the original String with the reversed String
				if (a.equals(b)){
					
					System.out.println("It is a Palindrome");
					
				}
				else
				{
					System.out.println("It is not Palindrome");
				}
	}

}
