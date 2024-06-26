package RepeatControlStatement;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("number? ");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                System.out.println("positive integer");
            } else {
                System.out.println("negative number");
            }
        }
    }
}
