import java.util.*;
public class FirstClass {
public static void main(String args[])
{ int a[][]=new int[3][3];
	if(args.length<9)
	{

		System.out.println("Please enter 9 numbers as command line arguments ");
		
	}
	else
	{ int k=0;int max=0;
	System.out.println("Entered array is:\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[k]);
				k++;
				System.out.print(a[i][j]+"\t");
				if(a[i][j]>max)
					max=a[i][j];
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is: "+max);
		
	}
	
}
}

