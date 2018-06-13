public class  Patient
{
	String name;
	double weight,height;
	public double BMI()
	{
		return ((weight/(height*height))*703);
	}
}