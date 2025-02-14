package q1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
	
		sc.close();
		char[][] ary=new char[num1][num1];
		char abc='A';
		for(int i=num1-1;i>=0;i--)
		{
			for(int j=num1-1;j>=0;j--)
			{
				if(abc>'Z')
				{
					abc='A';
				}
				ary[j][i]=abc;
				abc++;
			}
		}
	
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num1;j++)
			{
				System.out.printf("%c ", ary[i][j]);
			}
			System.out.println();
		}

		
		

	}

}
