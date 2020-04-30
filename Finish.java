import java.util.Scanner;
public class Finish {
	public static void main(String[] args)
	{
	Scanner stdIn = new Scanner(System.in);
	System.out.print("Enter a string : ");
	String str = stdIn.next();
	System.out.println("str = " + str + "\n");
	int len = str.length();
	String fHalf = str.substring(0, len/2);
	String sHalf =str.substring(len/2 + len%2);
	System.out.println("fHalf = " + fHalf);
	System.out.println("sHalf = " + sHalf + "\n");
	boolean palindrome = true;
	int j = len-1;
	int sum = 0;
	for (int i =0;i<len;i++) { 
		char forward_check = str.charAt(i);
		char backward_check = str.charAt(j);
		j--;
		if(forward_check == backward_check) {sum++;}
		if(sum == len) {palindrome = true;}
		else {palindrome = false;}
	}//end for
	
	System.out.println();
	if ( palindrome )
	System.out.println(str +" is a palindrome");
	else
	System.out.println(str +" is not a palindrome");
	stdIn.close();
	}
}
