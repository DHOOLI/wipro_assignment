class Bird extends Animal
{
 	public void eat()
 	{
 		System.out.println("Bird Eating..");
 	}
 	public void sleep()
 	{
 		System.out.println("Bird is Sleeping..");

 	}
 	public void fly()
 	{
 		System.out.println("Bird is Flying..");
 	}


 	public static void main(String[] args) {
 		
 		Animal animal=new Animal();
 		animal.eat();
 		animal.sleep();
 		Bird b=new Bird();
 		b.eat();
 		b.sleep();
 		b.fly();
 	}
}