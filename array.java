import java.util.Scanner;
public class array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the no of elements");
n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter the elements of the array");
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("elements of the array");
for(int i=0;i<n;i++)
{
System.out.println(" "+ar[i]);
}
}
}
