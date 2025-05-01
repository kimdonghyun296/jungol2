package q196;

public class Person {
	private String name;
	private String number;
	private String address;
	
	Person(String name,String number,String address)
	{
		this.name=name;
		this.number=number;
		this.address=address;
	}
	
	public void print()
	{
		System.out.println(this.name+" "+this.number+" "+this.address);
	
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getnumber()
	{
		return this.number;
	}
	
	public String getaddress()
	{
		return this.address;
	}
	
}
