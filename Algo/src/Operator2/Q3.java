package Operator2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("width = %d%n",(a+5));
        System.out.printf("length = %d%n",(b*2));
        System.out.printf("area = %d",((a+5)*(b*2)));
    }
}
