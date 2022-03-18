class Program21 
{
	public static void main(String[] args) 
	{
		double d=1232.243d;
		float f=(float)d; //narrowing (d-->f)
		long a=(long)d; //(narrowing (d-->l)
		int i=(int)d; //(narrowing (d-->i)
		char ch=(char)66; //(narrowing (i-->c)
		short s=(short)d; //(narrowing (d-->s)
		byte b=(byte)d; //(narrowing (d-->b)
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
		System.out.println(a);
		System.out.println(s);
		System.out.println(i);
		System.out.println(ch);

	}
}

