import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	int[] a=new int[]{1,5,6,4,8,6,3,7,90};
	int search_ele=8,index=-1;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==search_ele)
		{
			System.out.print("Element found at "+i+"th location.");
			index=i;break;
		}
	}
	if(index==-1)
	System.out.println(index);
}
}

