import java.util.Scanner;


public class Ceelsious_faren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius;
		System.out.println("enter the celsious value:");
		Scanner scan=new Scanner(System.in);
		celsius=scan.nextInt();
        double fahrenheit = (9/5)*celsius+32;
        System.out.println("The Farenheit value:" +fahrenheit);

	}

}
