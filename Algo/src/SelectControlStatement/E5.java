package SelectControlStatement;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 4, 6, 9, 11:
                System.out.println(30);
                break;
        }
    }
}
