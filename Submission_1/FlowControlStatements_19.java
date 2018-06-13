import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	
	int count=0;
	if(args.length>0){
	int n= Integer.parseInt(args[0]);
	while(count!=5)
	{
		if(n%2==0 && n%3==0 && n%5==0)
		{
			System.out.print(n+"\t");
			count++;
			
		}
		n++;
	}
	

	}
	else
		System.out.println("Please enter an integer number");
}
}

