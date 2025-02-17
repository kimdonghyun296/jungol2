package q617;

public class Person{
	private String name;
	private int num1;
	
	public Person(String name,int num1)
	{
		this.name=name;
		this.num1=num1;
	}
	
	public void print()
	{
		System.out.println(name+" "+num1);
	}
	
	public int getnum1()
	{
		return num1;
	}

}
