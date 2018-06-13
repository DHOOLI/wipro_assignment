class Ncopies
{
	public static void main(String[] args) {
		String str="Wipro";
		String s;
		if(str.length()<2)
		{
			 s=str;
		}
		else{
		 s=str.substring(0,2);}
		for(int i=0;i<=str.length()-1;i++)
		{
			System.out.print(s);
		}
	}
}