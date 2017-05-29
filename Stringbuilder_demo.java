
public class Stringbuilder_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----creating an object using bufer class----");
	StringBuffer sb=new StringBuffer("hello ");
	System.out.println("string in object1:::"+sb);
	System.out.println("going to append hi with object");
	sb.append(" hi!!!");
	System.out.println("afterappending:::");
	System.out.println(sb);
	StringBuilder sbi=new StringBuilder("goodmorning ");
	System.out.println("creating new object with builder class");
	System.out.println(sbi);
	System.out.println("going to append object of buffer with builder");
	sb.append(sbi);
	System.out.println(sb);
	System.out.println("ohhhh!!!!i missed a word guys..so i m goin to use insertfunc()");
sb.insert( 24, "guys");
System.out.println(sb);
System.out.println("done:)))he he");
	}

}
