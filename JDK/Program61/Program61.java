class Program61 
{
	public static void main(String[] args) 
	{
		int a=1000;
		int b=200;
		int c=30;
		if (a>b)
		{
			if (a>c)
			{
				System.out.println("max is"+a);
			}
			else
			{
				System.out.println("max is"+c);
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("max is"+b);
			}
			else
			{
				System.out.println("max is"+c);
			}
		}
	}
}
