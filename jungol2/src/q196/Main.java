package q196;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Person[] person=new Person[3];
		
		for(int i=0;i<3;i++)
		{
			person[i]=new Person(sc.next(),sc.next(),sc.next());
		}
		
		sc.close();
		
		char min=person[0].getname().charAt(0);
		
		for(int i=1;i<3;i++)
		{
			if(person[i].getname().charAt(0)<=person[i-1].getname().charAt(0))
			{
				min=person[i].getname().charAt(0);
			}
		}
		
		for(int i=0;i<3;i++)
		{
			if(person[i].getname().charAt(0)==min)
			{
				System.out.println("name : "+person[i].getname());
				System.out.println("tel : "+person[i].getnumber());
				System.out.println("addr : "+person[i].getaddress());
			}
		}
		
		
		

	}

}
