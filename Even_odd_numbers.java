import java.util.Scanner;


public class Even_odd_numbers {

	public static void main(String[] args) {
		
int i,odd=0,even=0;
int a[]=new int[5];
Scanner scan=new Scanner(System.in);
for(i=0;i<5;i++){
	System.out.println("Enter number :");
	a[i]=scan.nextInt();
}
for(i=0;i<5;i++)
{
if((a[i]%2)==0)
{
	even++;
	
}
else
	{
	odd++;
		
	}}
System.out.println("The numbers of even numbes inarray is:"+even);
System.out.println("The numbers of odd numbers inarray is:"+odd);
}}