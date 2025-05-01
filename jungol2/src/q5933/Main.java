package q5933;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		sc.close();
		for(int i=0;i<num1;i++)
		{
			int num2=i+1;
			for(int j=0;j<num1;j++)
			{
				
				System.out.printf("%d ", num2);
				num2+=i+1;
			}
			System.out.println();
		}
	}
}
