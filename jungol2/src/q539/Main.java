package q539;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] ary=new int[100];
		Scanner sc=new Scanner(System.in);
		int num1=0;
		while(true)
		{
			ary[num1]=sc.nextInt();		
			if(ary[num1]>=100)
			{
				break;
			}
			
			num1++;
		}
		num1++;
		sc.close();
		
		int sum=0;
		double avg=0;
		
		for(int i=0;i<num1;i++)
		{
			sum+=ary[i];
		}
		
		avg=(double)sum/num1;
		System.out.println(sum);
		System.out.printf("%.1f\n",avg);

	}

}
