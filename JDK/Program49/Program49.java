//Program to find minimum between 4 numbers.
class Program49 
{
	public static void main(String[] args) 
	{
		int a=25;
		int b=33;
		int c=49;
		int d=20;
		int res=(a<b && a<c && a<d)? a:((b<c && b<d))? b:((c<d ? c:d));
		System.out.println(res);
	}
}
