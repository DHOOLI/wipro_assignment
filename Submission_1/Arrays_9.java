import java.util.*;
public class FirstClass {
public static void main(String args[])
{	int[] arr=new int[]{1,7,6,8,7,9};
int index6=-1,index7=-1,sum=0;
	
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==6)
		index6=i;
	else if(arr[i]==7)
		index7=i;
}

if(index6!=-1&&index7!=-1&&index7-index6>=0)
{
	
		for(int i=0;i<arr.length;i++)
		{
			if(i>=index6 && i<=index7)
				continue;
			else
			{
				sum+=arr[i];
			}
			
		}
	
}
else
{
	for(int a:arr)
	{
		sum+=a;
	}
}
System.out.println("Sum is :"+sum);
}
}

