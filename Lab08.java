import java.util.Scanner;
//Daniel Maciejewski
//Lab Section 802
public class Lab08 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Enter a number of dice to roll between 100 and 100,000");
			 String unparsedUserInput = userInput.next();
			int parsedUserInput = Integer.parseInt(unparsedUserInput);
			System.out.println("You entered "+parsedUserInput);
			if (parsedUserInput < 100 || parsedUserInput >100000) {System.out.println("Invalid input.");}
			else {
				int v1 = 0,v2 = 0,v3 = 0,v4 = 0;
				for(int i = 0;i<parsedUserInput;i++) 
				{
				int die = (int)(Math.random()*4)+1;
				if(die == 1) {v1++;}
				else if (die == 2) {v2++;}
				else if (die == 3) {v3++;}
				else if (die == 4) {v4++;}
				}//end for
				System.out.println("The number 1 occurred "+v1+" times\nThe number 2 occurred "+v2+" times"
						+ "\nThe number 3 occurred "+v3+" times\nThe number 4 occurred "+v4+" times");
				flag = false;}//end if-else
		}while(flag == true);//end while
		
	}//end main

}//end class
