import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	int[] a=new int[]{9,97,8,99,10,15,106,109};
	Arrays.sort(a);
	System.out.println("max1="+a[a.length-1]+" max2="+a[a.length-2]+"\nmin1="+a[0]+" min2="+a[1]);
	
}
}

