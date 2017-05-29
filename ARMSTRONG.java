import java.util.Scanner;


public class ARMSTRONG {

	public static void main(String args[]){

		int n,sum=0,rem,temp;
		System.out.println("ARMSTRONG BETWEEN 100-500");
		 int n1, count = 0, a, b, c, sum1 = 0;
	        for(int i = 100; i <= 500; i++)
	        {
	            n1 = i;
	            while(n1 > 0)
	            {
	                b = n1 % 10;
	                sum1 = sum1 + (b * b * b);
	                n1 = n1 / 10;
	            }
	            if(sum1 == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum1 = 0;
	        }
}}
