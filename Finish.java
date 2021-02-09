import java.util.Scanner;
public class Finish {
	public static void main(String[] args)//this function determines if a given input word is a palindrome.
	{
	Scanner stdIn = new Scanner(System.in);//initialize keyboard input
	System.out.print("Enter a string : ");
	String str = stdIn.next();//get the keyboard input
	System.out.println("str = " + str + "\n");
	int len = str.length();//store the input strings length
	String fHalf = str.substring(0, len/2);//store first half of the input
	String sHalf =str.substring(len/2 + len%2);//store second half of the input
	System.out.println("fHalf = " + fHalf);
	System.out.println("sHalf = " + sHalf + "\n");
	boolean palindrome = true;
	int j = len-1;//fencepost the input length
	int sum = 0;
	for (int i =0;i<len;i++) {//index the strings and compare the two
		char forward_check = str.charAt(i);
		char backward_check = str.charAt(j);
		j--;
		if(forward_check == backward_check) {sum++;}
		if(sum == len) {palindrome = true;}
		else {palindrome = false;}
	}//end for
	
	System.out.println();
	if ( palindrome )//conditional reports the result of the for loop
	System.out.println(str +" is a palindrome");
	else
	System.out.println(str +" is not a palindrome");
	stdIn.close();
	}
}
