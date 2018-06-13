import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	//Scanner sc=new Scanner(System.in);
	//System.out.print("Enter Number: ");
	//int n=sc.nextInt();
	if(args.length==0)
	System.out.println("No Values");
	else
	{
		for(String i:args)
		{
			System.out.print(i+",");
			
			
		}
	}
}
}
