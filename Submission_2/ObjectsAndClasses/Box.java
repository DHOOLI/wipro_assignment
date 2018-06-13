import java.util.*;
class Box
{
	double width,height,depth;

	public void setDimentions(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double getVolume()
	{
		return width*height*depth;
	}
	public static void main(String[] args) {
		System.out.println("Please enter depth :");
		Scanner sc=new Scanner(System.in);
		double depth=Double.parseDouble(sc.next());
		System.out.println("Please enter height:");
		double height=Double.parseDouble(sc.next());
		System.out.println("Please enter width:");
		double width=Double.parseDouble(sc.next());
		Box box=new Box();
		box.setDimentions(width,height,depth);
		System.out.println("Volume of the box in cubic units is :"+box.getVolume());
		

	}
}