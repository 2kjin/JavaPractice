package Operator2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a + b + c + d;
        int avg = (a + b + c + d)/4;

        System.out.printf("sum %d%n", sum);
        System.out.printf("avg %d%n", avg);
    }

}
