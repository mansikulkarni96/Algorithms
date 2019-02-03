
public class StrReverseRecr {

	static int len;
	static int index=0;
public static void reverse(String s)
{
	if(len==0)
		return;
	else
	System.out.println(s.charAt(len-1));
	reverse(s.substring(0, len--));	
}
	
public static void main(String[] args)
{
	String initial="Hello World";
	len= initial.length();
	reverse(initial);
}
}
