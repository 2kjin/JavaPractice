import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d > %d --- %s\n", a, b, a > b);
        System.out.printf("%d < %d --- %s\n", a, b, a < b);
        System.out.printf("%d >= %d --- %s\n", a, b, a >= b);
        System.out.printf("%d <= %d --- %s\n", a, b, a <= b);
    }
}