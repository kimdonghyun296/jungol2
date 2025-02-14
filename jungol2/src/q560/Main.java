package q560;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] ary=new int[10];
		for(int i=0;i<ary.length;i++)
		{
			ary[i]=sc.nextInt();
		}
		sc.close();
		int min=ary[0];
		for(int i=1;i<ary.length;i++)
		{
			if(ary[i]<=min)
			{
				min=ary[i];
			}
		}
		System.out.println(min);
	}
}
