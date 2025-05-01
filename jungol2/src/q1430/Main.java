package q1430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary=new int[10];
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		sc.close();
		
		
		int num4=num1*num2*num3;
		String str=Integer.toString(num4);
		
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
			case '0':
			ary[0]+=1;
			break;
			case '1':
			ary[1]+=1;
			break;
			case '2':
			ary[2]+=1;
			break;
			case '3':
			ary[3]+=1;
			break;
			case '4':
			ary[4]+=1;
			break;
			case '5':
			ary[5]+=1;
			break;
			case '6':
			ary[6]+=1;
			break;
			case '7':
			ary[7]+=1;
			break;
			case '8':
			ary[8]+=1;
			break;
			case '9':
			ary[9]+=1;
			break;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(ary[i]);
		}
	}

}
