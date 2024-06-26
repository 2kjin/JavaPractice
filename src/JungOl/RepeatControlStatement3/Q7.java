package RepeatControlStatement3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        char ch = 'A';

        for (int i = 0; i < n; i++){
            for (int j = n; i < j ; j--){
                System.out.printf("%d ", cnt++);
            }
            for (int k = 0; k <= i; k++){
                System.out.printf("%c ", ch++);
            }
            System.out.println();
        }
    }
}
