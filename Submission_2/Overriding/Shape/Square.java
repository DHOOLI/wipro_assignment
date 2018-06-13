class Square extends Shape
{
	public void Draw()
	{
		System.out.println("Ddrawing Square..");

	}
	public void Erase()
	{

		System.out.println("Erasing Square..");
	}

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.Draw();
		c.Erase();
		t.Draw();
		t.Erase();
		s.Draw();
		s.Erase();




	}
}
