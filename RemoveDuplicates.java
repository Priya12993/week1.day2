package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // declare string input
		String text =  "We learn java basics as part of java sessions in java week1";
		
   //Initialize an integer variable as count
		int count=0;
	// split the string into array
		String str[]=text.split(" ");
		
		//iterate
		for (int i = 0; i < str.length; i++) {
			
		// Initialize another loop to check whether the word is there in the array
			
			for (int j = i+1; j < str.length; j++) {
				
				//if available
					if (str[i].equals(str[j])) {
			
		// then increase count by 1.
						count++;
				if (count>=1) {
					//if the count > 1 then replace the word as ""
					str[j]="";
				}
					}
			}
				System.out.print(str[i]+" ");
							}
				}
					}
						
					
			
			
		
		
		
	

 