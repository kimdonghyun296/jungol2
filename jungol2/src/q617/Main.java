package q617;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Person[] p=new Person[5];
		for(int i=0;i<5;i++)
		{
			String name=sc.next();
			int num1=sc.nextInt();
			p[i]=new Person(name,num1);
		}
		
		Person min=p[0];
		for(int i=0;i<p.length;i++)
		{
			if(min.getnum1()>p[i].getnum1())
			{
				min=p[i];
			}
		}
		min.print();
		
		
		
					
	}

}


