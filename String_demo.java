import java.lang.*;
public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="vishnu";
		String str2="priya";
		String str3="VISHNU";
		String str4=str1.concat(str2);
		System.out.println("length of string 1:" +str1 +  str1.length());
		System.out.println("uppercase of string after concat:"+str4.toUpperCase());
		System.out.println("character at position 5:" +str4.charAt(7));
		System.out.println("subsequence of concat string:"+str4.subSequence(7,11));
		System.out.println("hashcodeof str1:"+str1.hashCode());
		System.out.println("check isempty of string 2:"+str2  +str2.isEmpty());
		System.out.println("compare strings:");
		System.out.println(str1);
		System.out.println(str3);
		if(str1==str3)
		{
			System.out.println("both are equal");
		}			else {
				System.out.println("not equal");
		}
		System.out.println("USING EQUALS");
		System.out.println("compare strings:");
		System.out.println(str1);
		System.out.println(str3);
	
		if(str1.equals(str3))
		System.out.println("both are equal");
		else 
			System.out.println("not equal");
		System.out.println("USING EQUALS IGNORECASE");
		System.out.println("compare strings:");
		System.out.println(str1);
		System.out.println(str3);
	
		if(str1.equalsIgnoreCase(str3))
		System.out.println("both are equal");
		else 
			System.out.println("not equal");
		
		
		

	}

	private static String toupper(String str4) {
		// TODO Auto-generated method stub
		return null;
	}

}
