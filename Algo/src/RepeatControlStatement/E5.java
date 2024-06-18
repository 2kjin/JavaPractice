package RepeatControlStatement;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
        int base  = sc.nextInt();
        int height = sc.nextInt();
        double width = (double) (base * height) / 2;

        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        System.out.printf("Triangle width = %.1f%n", width);
        System.out.println("Continue? ");

        char ans = sc.next().charAt(0);

        if (ans != 'Y' || ans != 'y'){
            break;
        }
        }
    }
}
