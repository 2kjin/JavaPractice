package Operator;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + 100;
        b = b % 10;

        System.out.print(a + " " + b);
    }
}