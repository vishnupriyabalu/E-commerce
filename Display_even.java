import java.util.Scanner;


public class Display_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			if((i%2)==0)
			{
				System.out.println(i);
			}
		}

	}

}
