import java.util.Scanner;


public class Armstrong_not {
	public static void main(String args[]){

	int n,sum=0,rem,temp;
	System.out.println("enter a number:");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	  temp=n;    
	  while(n>0){    
	   rem=n%10;  //getting remainder  
	   sum=sum+(rem*rem*rem);    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("the given number is armsrong number");    
	  else    
	   System.out.println("The given number is not an armsrong number");    
	}  

}
