import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number: ");
	int n=sc.nextInt();
	if(n%2==0)
		System.out.println("Even number");
	else
		System.out.print("Odd number");
}
}
