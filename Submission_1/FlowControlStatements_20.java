import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	String a;
	Scanner sc=new Scanner(System.in);	
	do
	{
		System.out.print("Enter 1 for ADD and 2 for SUB");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:{
			System.out.println("Enter Two numbers to add :");
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println("Sum of given numbers: "+(b+c));
			break;
			
		}
		case 2:
		{
			System.out.println("Enter Two numbers to subtract :");
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println("Difference between given numbers: "+(b-c));
			break;
		}
		default:
		{
			System.out.println("Wrong Input");break;
		}
		}
		System.out.println("Enter y to continue..:");
		a=sc.next();
		
	}while(a.equalsIgnoreCase("y"));
}
}

