import java.util.*;
public class FirstClass {
public static void main(String args[])
{	int[] arr=new int[]{1,22,3,3,4,5,7,22,6,6,6,8,9};
	Set<Integer> set=new HashSet<Integer>();
	for(int a:arr)
	{
		set.add(a);
		
	}
	System.out.println(set.toString());
	
	
}
}

