import java.util.Scanner;


public class Check_Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the year:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n%4==0)
			System.out.println("Thegiven year "+n+" is leapyear");
		else
			System.out.println("Thegiven year "+n+" is not a leapyear");


	}

}
