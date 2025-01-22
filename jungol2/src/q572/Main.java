package q572;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int num1=sc.nextInt();
		sc.close();
		Calculate cal=new Calculate();
		System.out.printf("%.2f",cal.wide(num1));

	}

}
