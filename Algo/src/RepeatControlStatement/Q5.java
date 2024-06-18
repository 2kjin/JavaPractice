package RepeatControlStatement;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            n = sc.nextInt();
            if (n % 3 == 0) {
                System.out.println(n/3);
            }
            if (n == -1){
                break;
            }
        }
    }
}
