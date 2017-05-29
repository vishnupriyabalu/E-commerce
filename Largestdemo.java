import java.util.*;
import java.io.*;
public class Largestdemo {
	public static void main(String args[])
	{
		int a,b,c;
		System.out.print("enter number1");
		Scanner scan1=new Scanner(System.in);
		a=scan1.nextInt();
		System.out.println("enter number2");
		Scanner scan2=new Scanner(System.in);
		b=scan2.nextInt();
		System.out.print("enter number3");
		Scanner scan3=new Scanner(System.in);
		c=scan3.nextInt();
		
		if((a>b)&&(a>c))
			System.out.print("a is largest");
		else if(b>a&&b>c)
		System.out.println("b is greatest");
		else
			System.out.print("c is greatest");
	
	}

}
