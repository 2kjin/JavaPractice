package SelectControlStatement;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] num = {a, b, c};

        int min = num[0];
        for(int i=1; i<num.length; i++) {
            if(min > num[i]) min = num[i];
        }
        System.out.println(min);
    }
}
