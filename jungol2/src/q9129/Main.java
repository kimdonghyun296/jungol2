package q9129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		sc.close();
		
		String str1=String.format("%.2f", a);
		String str2=String.format("%.2f", b);
		String str3=String.format("%.2f", c);
		

		String str4=str1+str2+str3;
		for(int i=0;i<str4.length();i++)
		{
			if(str4.charAt(i)=='.')
			{
				System.out.println();
			}
			else {
				System.out.printf("%c", str4.charAt(i));
			}
		}

	}

}
