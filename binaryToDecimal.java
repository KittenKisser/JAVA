import java.util.Scanner;

public class binaryToDecimal {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int binaryNumber = userInput.nextInt();
		int decimal = 0;
	    int p = 0;
	    
	    while(true)
	    {
	      if(binaryNumber == 0){break;}//end if
	      
	      else {
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	       }//end else
	    }//end while

	}//end main

}//end class
