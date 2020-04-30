//Lab 11 
//Daniel Maciejewski
import java.util.Scanner;
public class Lab11
{
public static void main(String[] args)
{
int[] sent = {1, 3, 5, 7, 11, 13, 17, 0, 6, 8};
final int pSize = 10;
int[] sized = new int[pSize];
int eSize = 0;
for (int i = 0; i < pSize / 2; ++i)
{
sized[i] = 2 * i;
++eSize;
}
System.out.print("\nThe sentinel terminated array:\n");
printSentArray(sent, 0);
System.out.print("\nThe same sentinel terminated array doubled:\n");
doubArray(sent);
System.out.println();
System.out.print("\nThe sized array:\n");
printSizedArray(sized, eSize);
System.out.print("\nThe same sized array reversed:\n");
revArray(sized, eSize);

}
public static void printSizedArray(int[] arr, final int eSize)
{
for (int i = 0; i < eSize; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
public static void printSentArray(int[] arr, int sentVal)
{
for (int i = 0; arr[i] != sentVal; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
public static void revArray(int[] arr, final int eSize)

{
	int [] newArr = new int[eSize];
	int j =0;
	for(int i = eSize-1;i>=0;i--) {
		newArr[j]=arr[i];
		System.out.print(newArr[j]+" ");
		j++;
		}//end for

}//end revArray
public static void doubArray(int[] arr)
{
	int [] arrTimesTwo = new int[arr.length];
for (int i = 0;arr[i] != 0;i++) {
	arrTimesTwo[i]=arr[i]*2;
	System.out.print(arrTimesTwo[i]+" ");
}
}
}