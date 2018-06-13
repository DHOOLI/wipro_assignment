import java.util.*;
public class FirstClass {
public static void main(String args[])
{	
	String gender=args[0];
	int age=Integer.parseInt(args[1]);
	if((gender.equals("Female"))&&(age>0)&&(age<59))
		System.out.println("Interest rate is 8.2%");
	else if((gender.equals("Female"))&&(age>58)&&(age<121))
		System.out.println("Interest rate is 7.6%");
	else if((gender.equals("Male"))&&(age>0)&&(age<61))
		System.out.println("Interest rate is 9.2%");
	else if((gender.equals("Male"))&&(age>60)&&(age<121))
		System.out.println("Interest rate is 8.3%");
	
}
}
