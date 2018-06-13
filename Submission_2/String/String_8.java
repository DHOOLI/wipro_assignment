class String_8
{
	public static void main(String[] args) {
		String str="Wipro";
		String world="X";
		int seperator=3;
		StringBuilder s=new StringBuilder(str);
		for(int i=1;i<seperator;i++)
		{
			s.append(world);
			s.append(str);

		}
		System.out.println(s);
	}
}