package q11728;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		int[] ary3=new int[num1+num2];
		
		for(int i=0;i<num1+num2;i++)
		{
			ary3[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(ary3);
		
		for(int i=0;i<num1+num2;i++)
		{
			System.out.printf("%d ", ary3[i]);
		}

	}

}
