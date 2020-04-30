import java.util.Scanner;//get the input reading method library
//Name:Daniel Maciejewski
//Lab Section 802
//The purpose of this program is to concatenate a parsed user input to create a string of binary digits, and convert it into a decimal output. 

public class Program06 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);//initialize a new input object
		String bitstring = "";// bitstring will hold the user input
		boolean flag =false;//to conditionally test if user wants to remain in do-while loop
		System.out.println("Welcome to the bitstring converter\n---------------------------------------------");
		
		do{// this loop checks and accepts user input, updating the parameters if input is correct
			System.out.print("Choose an operator from the menu above :\n0 -> Concatenate a 0\n1 -> Concatenate a 1\n2 -> Exit");
			String choice = userInput.next();//holds user input
			char choiceCheck = choice.charAt(0);//gets the character in the first index location
			
			if (choiceCheck == '0') {
				bitstring += "0";//add a 0 to bitstring
				System.out.println(bitstring);//informs user of current state of bistring
				System.out.print("---------------------------------------------\n");
				}//end if
			
			else if (choiceCheck == '1') {
				bitstring += "1";//add a 1 to bitstring
				System.out.println(bitstring);//informs user of current state of bistring
				System.out.print("---------------------------------------------\n");
				}//end else-if
			
			else if (choiceCheck == '2') {flag = true;}//kicks user out of loop
			
			else {System.out.print("Invalid input\n");}//punts user back to input loop due to invalid input}
			
		}while(flag == false);//end do-while
		
		int x = 0;//create incrementor variable
	    int binaryNumber = Integer.parseInt(bitstring);//get the integer from the string
	    int base10 = 0;//Initialize base10 to 0
	    
	    while(true){/*this loop indexes the binaryNumber and if a 1 occurs, takes the index and raises it to the second power, 
	    	then sums it with the previous value of base10 thus converting binary to decimal*/
	      if(binaryNumber == 0){break;}//end if
	      
	      else {
	          int placeHolder = binaryNumber%10;
	          base10 += placeHolder*Math.pow(2, x);
	          binaryNumber = binaryNumber/10;
	          x++;//increment
	       }//end else
	    }//end while
		
		System.out.println(bitstring+"="+base10);//tells user final values of the variables
		userInput.close();//closes up open string object userInput 
	}//end main

}//end class
