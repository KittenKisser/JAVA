import java.util.Scanner;
public class Fix
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
int n;
do
{
System.out.print("Enter n [1, 9] : ");
n = stdIn.nextInt();

} while ( n < 1 && n > 9 );
System.out.println();
int x = n;
int y = n;
int z = 1;

//ok
for (int line = 1; line <= n; ++line)//ok
{

for (int s = 1; s <= line; ++s)//ok
System.out.print(' ');

for (int ld = x; ld >= 1; --ld)//ok
System.out.print(ld);

for (int rd = 1; rd <= x; ++rd)//ok
System.out.print(rd);
System.out.println();
x--;
}
//lower half
for (int line = 1; line <= n; ++line)//ok
{
	
for (int s = y; s >= 1; --s)//ok
System.out.print(' ');

for (int ld = z; ld >= 1; --ld)
System.out.print(ld);

for (int rd = 1; rd <= line; ++rd)
System.out.print(rd);
System.out.println();
z++;
y--;
}



stdIn.close();
}
}