class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println(10+10); //20
		System.out.println(10+'a'); //107
		System.out.println(10+10+'b'); //118
		System.out.println(10+'a'+"hello"); //107hello
		System.out.println("hello"+10+"hi"+"bye"); //hello10hibye
		System.out.println(20+20+'a'+'b'); //235
		System.out.println('a'+"hello"+10+20); //ahello1020
		//System.out.println('a'+'b');
	}
}
