import java.util.*;
public class FirstClass {
public static void main(String args[])
{	int reverse=0;
	if(args.length>0){
	int n= Integer.parseInt(args[0]);
	while(n != 0)
    {
        reverse =(reverse*10)+ n%10;
        n = n/10;
    }
	System.out.println(reverse);

	}
	else
		System.out.println("Please enter an integer number");
}
}

