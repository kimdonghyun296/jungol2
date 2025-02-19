package q573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		sc.close();
		Main main=new Main();
		main.print(num1);
		

	}
	public void print(int num1)
	{
		int number=1;
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num1;j++)
			{
				System.out.printf("%d ",number++);
			}
			System.out.println();
		}
	}

}
