import java.util.Scanner;


public class check_perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();
        for(int i = 1; i < n; i++)
        {  if(n % i == 0)
            sum = sum + i;
        }
        if(sum == n)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }    
    }

	}


