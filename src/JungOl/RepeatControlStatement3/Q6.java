package RepeatControlStatement3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 0; i < n; i++){
            for (int j = n; i < j ; j--){
                System.out.printf("%c", ch++);
            }
            System.out.println();
        }
    }
}
