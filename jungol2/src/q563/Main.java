package q563;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary=new int[10];
		for(int i=0;i<10;i++)
		{
			ary[i]=sc.nextInt();
		}
		
		Arrays.sort(ary);
		
		for(int i=9;i>=0;i--)
		{
			System.out.printf("%d ",ary[i]);
		}

	}

}
