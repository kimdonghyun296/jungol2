package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int[][] ary=new int[num1][num2];
		sc.close();
		int num3=1;
		for(int i=0;i<num1;i++)
		{
			if(i%2!=0)
			{
				
				for(int j=num2-1;j>=0;j--)
				{
					ary[i][j]=num3++;
				}
			}
			
			
			else
			{
				for(int j=0;j<num2;j++)
				{
					ary[i][j]=num3++;
				}
			}
		}
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num2;j++)
			{
				System.out.printf("%d ", ary[i][j]);
			}
			System.out.println();
		}
	}

}
