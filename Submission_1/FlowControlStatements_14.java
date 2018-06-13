import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	if(args.length>0){
	int num = Integer.parseInt(args[0]);
	if(num>1){
    boolean flag = false;
    for(int i = 2; i <= num/2; ++i)
    {
      
        if(num % i == 0)
        {
            flag = true;
            break;
        }
    }

    if (!flag)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
}else
	System.out.println(num+" is neither prime nor composite");
	}
	else
		System.out.println("Please enter an integer number");
}
}

