import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	int[] a=new int[]{5,5,5,5,5,5};
	int sum=0,avg=0;
	for(int i:a)
		sum+=i;
	avg=sum/a.length;
	System.out.println("Sum of array elements is "+sum+"\n Average of array elements is "+avg);
}
}

