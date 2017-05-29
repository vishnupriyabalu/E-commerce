import java.util.Scanner;


public class Exception_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,res,i;
		try{
			System.out.println("enter number1:");
			Scanner scan1=new Scanner(System.in);
			n1=scan1.nextInt();
			System.out.println("enter number 2:");
			//Scanner scan2=new Scanner(System.in);
			n2=scan1.nextInt();
			res=n1/n2;
			System.out.println("The result of the division is: "+res);
				try
				{
						int a[]=new int[3];
						//Scanner scan3=new Scanner(System.in);
						for(i=0;i<3;i++)
							{
								System.out.println("enter a number :");
								a[i]=scan1.nextInt();
								//System.out.println("display all elements of array" +a[i]);
							}
				}
				catch(ArrayIndexOutOfBoundsException aie)
				{
					System.out.println("array index out of bound exception");
				}
			}
			catch(ArithmeticException ae)
			{
				System.out.println("arithmetic Exception");
			}
			catch(Exception e)
			{
				System.out.println("unexpected exception occured");			
			}
			finally
			{
				System.out.println("done!! with the exception examle");
			}
	}
}
	


