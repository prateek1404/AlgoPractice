public class Test
{
	public Test method()
	{
		return new Test();
	}

}
class Test1 extends Test
{
	public Test1 method()
	{
		return new Test1();
	}


}
class Test2 extends Test1
{
	public Test method()
	{
		return new Test2();

	}


}


