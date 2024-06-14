package Operator2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minsu_height = sc.nextInt();
        int minsu_weight = sc.nextInt();
        int kiyoung_height = sc.nextInt();
        int kiyoung_weight = sc.nextInt();

        System.out.println(minsu_height > kiyoung_height && minsu_weight > kiyoung_weight);

    }
}
