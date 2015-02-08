class A
{
	public void print()
	{
		System.out.println("Printing A");
	}

}
class B extends A
{
	public void print()
	{
		System.out.println("Printing B");

	}


}

public class Test
{
	public static void main(String args[])
	{
		A inst = new B();
		inst.print();

	}

}
