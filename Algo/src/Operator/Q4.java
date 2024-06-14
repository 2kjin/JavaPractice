package Operator;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = a++ * --b;

        System.out.printf("%d %d %d", a, b, res);
    }
}