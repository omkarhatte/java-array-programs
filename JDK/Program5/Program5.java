class Program5 
{
	public static void main(String[] args) 
	{
		System.out.println(10+"A"); //10A
		System.out.println(100+"AB"); //10AB
		System.out.println(10+'a'+"hello"); //107hello
		System.out.println("hello"+10+"hi"+"bye"); //hello10hibye
		System.out.println(20+20+'a'+'b'); //235
		System.out.println('a'+"hello"+10+20); //ahello1020
	}
}
