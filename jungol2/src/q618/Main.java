package q618;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person[] person=new Person[5];
		
		for(int i=0;i<5;i++)
		{
			String name=sc.next();
			int height=sc.nextInt();
			double weight=sc.nextDouble();
			
			person[i]=new Person(name,height,weight);
			
		}
		
		Arrays.sort(person, Comparator.comparing(p -> p.name));
		System.out.println("name");
		
		for(Person p:person)
		{
			System.out.println(p.name+" "+p.height+" "+p.weight);
		}
		System.out.println();
		
		Arrays.sort(person, Comparator.comparing(Person::getWeight).reversed());
		
		System.out.println("weight");
		
		for(Person p:person)
		{
			System.out.println(p.name+" "+p.height+" "+p.weight);
		}
		

	}

}
