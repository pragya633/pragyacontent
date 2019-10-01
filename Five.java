
public class Five {
	
public static void main(String[] args) {
	String s1="Java";
	char ch[]={'J','a','v','a'};
	String s2=new String(ch);
	String s3=new String("Java");
	String s4=new String("Java");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	System.out.println(s1.charAt(2));
}
}
