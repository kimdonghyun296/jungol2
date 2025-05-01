package q1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//65~90
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		sc.close();
		int num2=65;
		int[][] ary=new int[num1][num1];
		
		for(int i=0;i<num1;i++)
		{
			for(int j=num1-1, b=i;b<num1;j--,b++)
			{
				if(num2>90)
				{
					num2=65;
				}
				ary[b][j]=num2;
				num2++;
			}
		}
		
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num1;j++)
			{
				if(ary[i][j]==0)
				{
					System.out.print(" ");
				}
				else {
					System.out.printf("%c", ary[i][j]);
				}
				System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}
}
