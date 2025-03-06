package q604;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] ary=new String[11];
		
		for(int i=0;i<11;i++)
		{
			ary[i]=sc.next();
		}

		sc.close();
		
		for(int i=0;i<10;i++)
		{

			for(int j=0;j<ary[i].length();j++)
			{
				if(j==(ary[i].length()-1))
				{
					if(ary[i].charAt(j)==ary[10].charAt(0))
					{
						System.out.println(ary[i]);
					}
				}
			}
		}

	}

}
