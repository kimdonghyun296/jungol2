package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary=new int[10];
		int min1=0;
		int min2=1000;
		

		for(int i=0;i<ary.length;i++)
		{
			ary[i]=sc.nextInt();
			if(ary[i]<100)
			{
				if(ary[i]>=min1)
				{
					min1=ary[i];
				}
			}
			else if(ary[i]>=100)
			{
				if(ary[i]<=min2)
				{
					min2=ary[i];
				}
			}
		}
		if(min1==0)
		{
			min1=100;
		}
		if(min2==1000)
		{
			min2=100;
		}
		sc.close();
		System.out.printf("%d %d",min1,min2);
	}
}
