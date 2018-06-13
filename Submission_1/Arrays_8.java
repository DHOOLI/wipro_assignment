import java.util.*;
public class FirstClass {
public static void main(String args[])
{	int[] arr=new int[]{1,22,3,3,4,5,7,22,6,6,6,8,9};
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int a:arr)
	{
		if(map.containsKey(a))
		{
			int q=(int)map.get(a);
			q++;
			map.put(a,q);
			
		}
		else
		{
			map.put(a,1);
		}
	}
	int max=(Collections.max(map.values()));
	for(int a:map.keySet())
	{
		if(map.get(a)==max)
		{
			System.out.print("element"+a+" repeated "+map.get(a)+"times");
		}
	}
	
	
	
}
}

