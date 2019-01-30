import java.util.*;
public class stringswap {
public static void main(String args[]) {
	String a="abcdef";
	String b="fbcdea";
	int cnt=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!=b.charAt(i)){
			++cnt;
		}}
	if(cnt==2) {
	System.out.println("conversion possible");	
	}
	else {
		System.out.println("not possible");
	}
}
}
