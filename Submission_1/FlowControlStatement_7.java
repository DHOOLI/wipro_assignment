import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	System.out.println("Enter a character.");
	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	if(Character.isUpperCase(a))
		System.out.print(a+"->"+Character.toLowerCase(a));
	else if(Character.isLowerCase(a))
		System.out.print(a+"->"+Character.toUpperCase(a));
}
}

