class Employee extends Person
{
	public double salary;
	public int year;
	public String insuranceId;

	public Employee(String name,double salary,int year,String id)
	{
		super(name);
		this.salary=salary;
		this.year=year;
		insuranceId=id;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getYear()
	{
		return year;
	}
	public String getId()
	{
		return insuranceId;
	}
}