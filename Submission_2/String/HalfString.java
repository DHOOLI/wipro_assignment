class HalfString
{
	public static void main(String[] args) {
		String str="CatDog";
		if(str.length()%2==0)
		{
			System.out.println(str.substring(0,str.length()/2));
		}
		else
		{
			System.out.println("Returning Null");
		}
	}
}