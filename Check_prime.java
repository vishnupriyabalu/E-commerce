import java.io.*;
import java.util.*;
public class Check_prime {
public static void main(String args[]){
int n,a,result=0,i;
System.out.println("enter a number");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
	for(i=2;i<n;i++)

{
	if(n%i==0){
		result=1;
		
	}
	
}
	if(result==0)
		System.out.println("The given num"+n+"is a prime");
	else
System.out.println("The given no is not a prime");
}
}


