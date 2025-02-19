package q564;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ary = new char[100]; 
        int[] ary2 = new int[100]; 
        int num1 = 0;

        
        while (true) {
            char a = sc.next().charAt(0);
            if (a >= 'A' && a <= 'Z') {
                ary[num1++] = a;
            } else {
                break;
            }
        }

       sc.close();
        Arrays.sort(ary, 0, num1);

   
        for (int i = 0; i < num1; i++) {
            int count = 1;
            for (int j = i + 1; j < num1; j++) {
                if (ary[i] == ary[j]) {
                    count++;
                } else {
                    break; 
                }
            }
            ary2[i] = count;
            i += (count - 1); 
        }

       
        for (int i = 0; i < num1; i++) {
            if (ary2[i] > 0) { 
                System.out.println(ary[i] + " : " + ary2[i]);
            }
        }
    }
}

