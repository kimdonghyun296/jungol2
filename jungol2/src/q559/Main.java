package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double abc[]= {85.6,79.5,83.1,80.0,78.2,75.0};
		
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		System.out.printf("%.1f",abc[num1-1]+abc[num2-1]);

	}
}
