import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number: ");
	int n=sc.nextInt();
	if(n>0)
		System.out.println("Positive");
	else if(n<0)
		System.out.println("Negative");
	else
		System.out.println("Zero");
	
}
}
