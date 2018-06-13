import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	int[] a=new int[]{1,5,6,4,8,6,3,7,0};
	int max=a[0],min=a[0];
	for(int i:a)
	{
		if(max<i)
			max=i;
		if(min>i)
			min=i;
	}
	System.out.println("Max element is "+max+"\nMin element is "+min);
}
}

