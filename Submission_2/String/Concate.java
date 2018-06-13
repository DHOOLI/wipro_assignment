import java.util.*;
class Concate
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two worlds to concate");
		String s1=s.next();
		String s2=s.next();
		char c1=s1.charAt(s1.length()-1);
		char c2=s2.charAt(0);
		if(c1==c2)
		{
			s2=s2.substring(1);
		
		}
		s1=s1.concat(s2).toLowerCase();
		System.out.println(s1);
	}
}