package RepeatControlStatement;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;

        while (i <= a) {
            System.out.print(i + " ");
            i ++;
        }
    }
}
