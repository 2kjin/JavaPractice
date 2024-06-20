package JavaJungSukBasic;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Quiz4();
    }

    static void Quiz1_1(int x){
        System.out.println(x >= 10 && x <= 20);
    }

    static void Quiz1_2(char ch){
        System.out.println(ch!=' ' && ch !='\t');
    }

    static void Quiz1_3(char ch){
        System.out.println(ch == 'x' || ch == 'X');
    }

    static void Quiz1_4(char ch){
        System.out.println('0' <= ch && ch <='9');
    }

    static void Quiz1_5(char ch){
        System.out.println(Character.isUpperCase(ch) || Character.isLowerCase(ch));
    }

    static void Quiz1_6(int year){
        System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    static void Quiz1_7(boolean powerOn){
        System.out.println(!powerOn);
    }

    static void Quiz1_8(String str){
        System.out.println(str.equals("yes"));
    }

    static void Quiz2(){
        int sum = 0;
        for(int i = 1; i<=20 ; i++){
            if (i % 2 !=0){
                sum += i;
            }
            if (i % 3 !=0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static void Quiz3(){
        int sum = 0;
        int res = 0;
        for(int i=1; i <=10; i++) {
            sum += i;
            res += sum;
        }
        System.out.println(res);
    }

    static void Quiz4(){
        int sum = 0;
        int i = 0;

        while (sum < 100) {
            if (i % 2 == 0) {
                sum += i * -1;
            }else {
                sum += i;
            }
            i++;
        }
        if (i % 2 == 0) {
            System.out.println(-i);
        }else {
        System.out.println(i);
        }
    }

    static void Quiz5(){
        int i = 0;
        while(i <= 10) {
            int j = 0;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    static void Quiz6(){
        for(int i = 1;i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    static void Quiz7(){
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (int)str.charAt(i) - 48;
        }
        System.out.println("sum=" + sum);
    }

    static void Quiz8(){
        int value = (int)(Math.random()*6)+1;;
        System.out.println("value : " + value);
    }

    static void Quiz9(){
        int num = 12345;
        int sum = 0;

        while(num > 0) {
            sum += num%10;
            num /= 10;
        }

        System.out.println("sum = " + sum);
    }

    static void Quiz10(){
        int ans = (int)(Math.random() * 100) + 1;;
        int input = 0;
        int cnt = 0;

        Scanner s = new Scanner(System.in);

        do{
            cnt++;
            System.out.println("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt();

            if (ans > input){
                System.out.println("더 큰 수를 입력하세요.");
            } else if (ans < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞혔습니다.");
                System.out.println("시도횟수는 " + cnt + "번입니다.");
                break;
            }
        } while (true);
    }
}
