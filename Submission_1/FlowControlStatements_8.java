import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	System.out.println("Enter a character.");
	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	switch(a)
	{
	case 'R':
		System.out.println("Red");break;
	case 'B':
		System.out.println("Blue");break;
	case 'O':
		System.out.println("Orange");break;
	case 'Y':
		System.out.print("Yellow");break;
	
	case 'G':
		System.out.println("Green");
	break;
	case 'W':
		System.out.print("White");break;
		default:
			System.out.print("Invalid Color code");
	}
		
}
}

