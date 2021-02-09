import java.util.Scanner;
public class Figure
{
  public static void main(String []  args)
  {
   
    Scanner stdIn = new Scanner(System.in);
    int n;
    
    do
    {
		System.out.print("Enter n [1, 9] : ");
		n = stdIn.nextInt();
    } while ( n < 1 && n > 9 );
    
    System.out.println();
    for (int line = 1; line <= n; ++line)
    {
		for (int s = 1; s <= line; ++s)
		System.out.print(' ');
		for (int ld = 1; ld <= line; ++ld)
		System.out.print(ld);
		for (int rd = 1; rd <= line; ++rd)
		System.out.print(rd);
		System.out.println();
    }//end for
	  
    for (int line = 1; line <= n; ++line)
    {
		for (int s = 1; s <= line; ++s)
		System.out.print(' ');
		for (int ld = 1; ld <= line; ++ld)
		System.out.print(ld);
		for (int rd = 1; rd <= line; ++rd)
		System.out.print(rd);
		System.out.println();
    }//end for
    stdIn.close();
    }//end main
    
  
}//end class
