package SelectControlStatement;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int value = weight + 100 - height;

        System.out.println(value);
        if(value > 0){
            System.out.println("Obesity");
        }
    }
}
