import java.util.Scanner;


public class Check_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n%2==0)
			System.out.println("Thegiven n "+n+" is even");
		else
			System.out.println("Thegiven n "+n+" is odd");

	}

}
