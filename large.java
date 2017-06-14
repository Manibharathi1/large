import java.io.*;
import java.util.Scanner;
public class large
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
if(n1>n2)
{
System.out.println(n1);
}
else if(n2>n3)
{
System.out.println(n2);
}
else if(n3>n1)
{
System.out.println(n3);
}
else
{
System.out.println("invalid input");
}
}
}

