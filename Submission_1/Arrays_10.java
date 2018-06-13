import java.util.*;
public class FirstClass {
public static void main(String args[])
{
	if(args.length<4)
	{

		System.out.println("Please enter 4 numbers as command line arguments ");
		
	}
	else
	{
		System.out.println(" The given array is :\n");
		for(int i=0;i<2;i++)
			System.out.print(args[i]+"\t");
		System.out.println();
		for(int i=2;i<4;i++)
			System.out.print(args[i]+"\t");
		System.out.println("\nThe reverse of the array is :\n");
		for(int i=3;i>1;i--)
			System.out.print(args[i]+"\t");
		System.out.println();
		for(int i=1;i>=0;i--)
			System.out.print(args[i]+"\t");
		
	}
	
}
}

