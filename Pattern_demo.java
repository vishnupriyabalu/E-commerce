import java.math.MathContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pattern_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello i am here";
		System.out.println("The huge long string is" +s1);
		System.out.println("going to search in that huge sting");
		System.out.println("Is pattern found:");
		Pattern p=Pattern.compile("am");
		Matcher m=p.matcher(s1);
		if(m.find())
		{
			System.out.println("yes!!pattern found");
		}
		else
			System.out.println("No!!pattern not found:");
	     p=Pattern.compile("hel");
	     m=p.matcher(s1);
	     if(m.find())
			{
				System.out.println("yes!!pattern found");
			}
			else
			{
				System.out.println("No!!pattern not found:");
			}
	     		System.out.println("startindex:"+ m.start());
	     		System.out.println("end index" + m.end());
	     		System.out.println("replacing the first :"+m.replaceFirst("ha ha"));
	     		
	}}
