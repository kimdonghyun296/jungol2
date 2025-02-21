package q565;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		int[] num1=new int[100];
	
		int num2=0;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			int num3=sc.nextInt();
			num2++;
			
			if(num3==0)
			{
				break;
			}
			num1[num3/10]++;
			
		}
		sc.close();
		for(int i=0;i<100;i++)
		{
			if(num1[i]>0)
			{
				System.out.println(i+" : "+num1[i]);
			}
		}
	
	}

}
