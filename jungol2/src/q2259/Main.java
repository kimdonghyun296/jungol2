package q2259;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//동 1 서 2 남 3 북 4
		Scanner sc=new Scanner(System.in);
		int[][] ary=new int[20][2];
		int max1=0;
		int max2=0;
		int min1=0;
	
		int num1=sc.nextInt();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<ary[i].length;j++)
			{
				ary[i][j]=sc.nextInt();
			}
			
		}
		sc.close();
		
		for(int i=0;i<6;i++)
		{
			if(ary[i][0]==3||ary[i][0]==4)
				{
					if(ary[i][1]>=max1)
					{
						max1=ary[i][1];				
					}
				}

		}
		
		for(int i=0;i<6;i++)
		{
			if(ary[i][0]==1||ary[i][0]==2)
				{
					if(ary[i][1]>=max2)
					{
						max2=ary[i][1];				
					}
				}

		}
		ary[6][0] = ary[0][0];
        ary[6][1] = ary[0][1];

		for(int i=0;i<6;i++)
		{

				if(ary[i][0]==1 &&ary[i+1][0]==3)
				{
					min1=ary[i][1]*ary[i+1][1];
				}
				if(ary[i][0]==4 &&ary[i+1][0]==1)
				{
				min1=ary[i][1]*ary[i+1][1];
				}
				if(ary[i][0]==3 &&ary[i+1][0]==2)
				{
				min1=ary[i][1]*ary[i+1][1];
				}
				if(ary[i][0]==2 &&ary[i+1][0]==4)
				{
				min1=ary[i][1]*ary[i+1][1];
				}
			

		}
		
		System.out.println(num1*(max1*max2-min1));
		
		
	}

}
