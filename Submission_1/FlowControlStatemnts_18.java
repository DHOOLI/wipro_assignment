import java.util.*;
public class FirstClass {
public static void main(String args[])
{	int reverse=0,num;
	if(args.length>0){
	int n= Integer.parseInt(args[0]);
	num=n;
	while(n != 0)
    {
        reverse =(reverse*10)+ n%10;
        n = n/10;
    }
	if(num==reverse)
	System.out.println(num+" is a palindrome");
	else
		System.out.println(num+" is not a palindrome");

	}
	else
		System.out.println("Please enter an integer number");
}
}

