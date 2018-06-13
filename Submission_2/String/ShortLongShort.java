class ShortLongShort
{
	public static void main(String[] args) {
		String s1="hi";
		String s2="hello";

		int s1Length=s1.length();
		int s2Length=s2.length();
		if(s1Length>s2Length)
		{
			System.out.println(s2+s1+s2);

		}
		else
		{
			System.out.println(s1+s2+s1);
		}
	}
}