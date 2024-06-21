package Star;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n <= 100 && 1 <= m && m <=3) {
            switch (m) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = n - 1; i >= 0; i--) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= n; i++) {
                        int spaces = n - i;
                        for (int j = 0; j < spaces; j++) {
                            System.out.print(" ");
                        }
                        int stars = 2 * i - 1;
                        for (int j = 0; j < stars; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }else {
            System.out.println("INPUT ERROR!");
        }
    }
}
