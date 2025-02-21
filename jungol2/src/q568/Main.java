package q568;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[][] ary1=new int[2][4];
		int[][] ary2=new int[2][4];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("first array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				ary1[i][j]=sc.nextInt();
			}
		}
		System.out.println("second array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				ary2[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(ary1[i][j]*ary2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
