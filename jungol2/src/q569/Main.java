package q569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] ary=new int[5][4];
		int count=0;
		for(int i=0;i<ary.length;i++)
		{
			int sum=0;
			
			for(int j=0;j<ary[0].length;j++)
			{
				ary[i][j]=sc.nextInt();
				sum+=ary[i][j];
			}
			
			if((sum/4)>=80)
			{
				System.out.println("pass");
				count++;
			}
			else
			{
				System.out.println("fail");
			}
			
		}
		sc.close();
		System.out.println("Successful"+" : "+count);
		
	}

}
