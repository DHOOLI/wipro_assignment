class Test
{
	public static void main(String[] args) {
		Teacher teacher=new Teacher("niranjan",2000,"Computer science");
		System.out.println(" Teacher name: "+teacher.name+" Salary:"+teacher.Salary+" Subject: "+teacher.subject);
		CollegeStudent c=new CollegeStudent("Nandu",2012,"Others");
		System.out.println(" Student Name: "+c.name+" year:"+c.year+" major :"+c.major);
	}
}