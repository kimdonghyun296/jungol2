package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		
		int num1=str.length()-1;
		int num2=str.length()-1;
		for(int a=0;a<str.length();a++)
		{
				for(int b=num1;b<str.length();b++)
				{
					System.out.printf("%c",str.charAt(b));
				}
				num1--;
				for(int c=0;c<num2;c++)
				{
					System.out.printf("%c",str.charAt(c));
				}

				num2--;
				System.out.println();
		}
	}
}
