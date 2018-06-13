import java.util.*;
class Calculator
{
	public static double powerInt(int num1,int num2){
		return Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,int num2){
		return Math.pow(num1,num2);

	}

}
class Main{
	public static void main(String[] args) {
		System.out.println("5 to the Power of 5 ="+Calculator.powerInt(5,5));
		System.out.println("5.5555 to the power of 5="+Calculator.powerDouble(5.5555,5));
	}
}

