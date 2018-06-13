import java.util.*;
public class Patients
{
	public static void main(String args[])
	{
		Patient p1=new Patient();
		p1.name="NIRANJAN";
		p1.weight=165.5;
		p1.height=63;
		double bmi=p1.BMI();
		System.out.println("BMI of the Patient is :"+bmi);
	}
}


