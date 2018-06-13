import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	if(args.length>0){
	int n= Integer.parseInt(args[0]);
	int sum,num=n;

	for (sum = 0; num > 0; sum += num % 10,
            num /= 10);
	System.out.println(n+"->"+sum);
	}
	else
		System.out.println("Please enter an integer number");
}
}

