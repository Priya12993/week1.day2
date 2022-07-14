package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Declare the input
String text = "I am a software tester";

//split the words
String str[]=text.split(" ");

//Traverse through each word (using loop)
for (int i = 0; i < str.length; i++) {
	
//find the odd index within the loop (use mod operator)
	if (i%2==0)
	{
		//split the words and have it in an array
		char[] charArray = str[i].toCharArray();
		//print the even position words in reverse order using another loop
		for (int j = charArray.length-1; j >=0; j--) {
			System.out.print(charArray[j]);
			
		}
	}
	else {
		System.out.print(" "+ str[i]+" ");
	}
}


	}

}
