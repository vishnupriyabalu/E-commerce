import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,rem,temp;
		System.out.println("enter a number:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		  temp=n;    
		  while(n>0){    
		   rem=n%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  


	}


