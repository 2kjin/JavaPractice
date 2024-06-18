package RepeatControlStatement;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Korea\n" +
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China\n" +
                    "number?");
            int n = sc.nextInt();
            if (n == 1){
                System.out.println("Seoul");
            } else if (n == 2) {
                System.out.println("Washington");
            } else if (n == 3) {
                System.out.println("Tokyo");
            } else if (n == 4) {
                System.out.println("Beijing");
            } else {
                System.out.println("none");
                break;
            }
        }
    }
}
