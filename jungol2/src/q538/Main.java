package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.printf("number? ");
			int num1=sc.nextInt();
			
			if(num1>0)
			{
				System.out.println("positive integer");
			}
			else if(num1<0)
			{
				System.out.println("negative number");
			}
			else
			{
				sc.close();
				break;
			}
		}

	}
}
