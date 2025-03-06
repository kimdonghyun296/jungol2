package q190;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String[] ary= {"flower", "rose", "lily", "daffodil", "azalea"};
		
		String a=sc.next();
		sc.close();
		int count=0;
		for(int i=0;i<ary.length;i++)
		{
			
			if(ary[i].charAt(1)==a.charAt(0)||ary[i].charAt(2)==a.charAt(0))
			{
				System.out.println(ary[i]);
				count++;
			}
		}
		System.out.println(count);
		
	}

}
