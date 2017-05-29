import java.util.Scanner;


public class Perfect_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100,sum=0;

	    for(int num = 1; num <= n; num++)
	    {
	    sum = 0;
	    for(int i = 1; i < num; i++)
	    {
	       if(!(num%i))
	       {
	          sum+=i;
	       }
	       if(sum==num)
	    	   System.out.println("Is perfect numb");
	    }
	}

	}}
