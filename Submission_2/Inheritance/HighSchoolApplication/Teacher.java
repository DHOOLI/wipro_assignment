class Teacher extends Person
{
	public int Salary;
	public String subject;
	public Teacher(String n,int s,String sub)
	{
		super(n);
		Salary=s;
		subject=sub;
	}
}