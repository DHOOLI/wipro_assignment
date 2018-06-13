import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	//Scanner sc=new Scanner(System.in);
	//System.out.print("Enter Number: ");
	//int n=sc.nextInt();
	
	char a='t';
	if(Character.isLetter(a))
		System.out.print("Alphabet");
	else if(Character.isDigit(a))
		System.out.println("Digit");
	else
		System.out.print("Special Charecter");
	
	
}
}
