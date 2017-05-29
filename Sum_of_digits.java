import java.util.Scanner;


public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,rem;
		System.out.println("enter a number:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		 while(n!=0)
	       {
	           rem=n%10;
	           sum=sum+rem;
	           n=n/10;
	           
	       }
	     System.out.println("sum of the digits:"+ sum);  

	}

}
