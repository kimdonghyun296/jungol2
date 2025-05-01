package q193;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] a = new String[5];
      for (int i = 0; i < 5; i++) {
         a[i] = sc.next();
      }
      char c = sc.next().charAt(0);
      String s = sc.next();
      sc.close();
      
      int cnt = 0;
      for (int i = 0; i < 5; i++) {
         if (a[i].indexOf(s) != -1 || a[i].indexOf(c) != -1) {
            System.out.println(a[i]);
            cnt++;
         }
      }
      if (cnt == 0) System.out.println("none");
      
   }

}

