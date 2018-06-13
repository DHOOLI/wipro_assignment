class Palindrome
{
	public static void main(String[] args) {
		String str="aba";
		StringBuffer str2=new StringBuffer(str);
		if(str.equalsIgnoreCase(str2.reverse().toString()))
		{
			System.out.println("Palindrome");

		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}