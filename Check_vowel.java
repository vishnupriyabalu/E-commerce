import java.util.Scanner;


public class Check_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c;
System.out.println("enter a char");
Scanner scan=new Scanner(System.in);
c=scan.next().charAt(0);
switch(c)
{
case'a':
case'A':
	System.out.println("it is a vowel");
	break;
case'e':
case'E':
	System.out.println("it is a vowel");
	break;
	
case'i':
case'I':
	System.out.println("it is a vowel");

case'o':
case'O':
	System.out.println("it isa vowel");
case'u':
case'U':
	System.out.println("it is a vowel");
	default:
		System.out.println("it is a consonant");
}
}
}
