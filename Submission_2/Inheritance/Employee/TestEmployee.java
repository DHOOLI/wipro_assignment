class TestEmployee
{
	public static void main(String[] args) {
		Employee employee=new Employee("Niranjan",20000,2012,"ID201254544");
		System.out.println("Name: "+employee.getName()+" Salary: "+employee.getSalary()+" Year: "+employee.getYear()+" ID: "+employee.getId());
	}
}