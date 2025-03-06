package q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 00 10 20 30
		int num1=sc.nextInt();
		//65~90
		int[][] ary=new int[num1][num1];
		int num2=65;
		int count=1;
		for(int i=0;i<num1;i++)
		{
			
			if(count==1)
			{
				for(int j=0;j<num1;j++)
				{
					ary[j][i]=num2++;
					if(num2>90)
					{
						num2=65;
					}
				}
				count=2;
			}
			else {
				for(int d=num1-1;d>=0;d--)
				{
					ary[d][i]=num2++;
					if(num2>90)
					{
						num2=65;
					}
				}
				count=1;
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
