import java.util.Scanner;
public class Lab10
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
int a = 1, b = 3, c = 5;
double x = 2.2, y = 4.4, z = 6.6, ans;
ans = average(a, b);

System.out.println("\naverage(a, b) = " + ans);
ans = average(a, b, c);

System.out.println("\naverage(average(a, b), c) = " + ans);
ans = average(average(a, b), c);

System.out.println("\naverage(a, b, c) = " + ans);
ans = average(x, y);

System.out.println("\naverage(x, y) = " + ans);
ans = average(x, y, z);

System.out.println("\naverage(x, y, z) = " + ans);
ans = average(1, 2.0, 3);

System.out.println("2. Do you really need the three parameter version of average?");
System.out.println("\nIs average(1, 2.0, 3) legal, and if so which version is used, and why?\naverage(1, 2.0, 3) = " + ans);


if(average(average(a,b), c) == average(a, b, c)) {System.out.print("average(average(a,b), c) == average(a, b, c)");}
else {System.out.print("average(average(a,b), c) =/= average(a, b, c)");}
}//end main

public static double average(int n1, int n2)
{
return (n1 + n2) / 2.0;
}
public static double average(int a,int b,int c) {
	return (a+b+c)/3.0;
}
public static double average(double x,double y) {
	return (x+y)/2.0;
}
public static double average(double x, double y, double z) {
	return (x+y+z)/3.0;
}

}//end class

/*Answer to questions
 * 1. Do you really need the int parameter version(s) of average, and why?
Answer: The int version of the method would make output look better to the human eye or be less resource intensive, but if we wanted accuracy, then no, we don't need the int version. 
 *  2. Do you really need the three parameter version of average?
Answer: Yes, rounding errors will bias your output.
 *  3. Is average(1, 2.0, 3) legal, and if so which version is used, and why?
Answer: Yes it is legal, it calls public static double average(double x, double y, double z), because the compiler sees the 2.0, this parameter would not be legal for public static double average(int a,int b,int c)
 * 
 * */
 