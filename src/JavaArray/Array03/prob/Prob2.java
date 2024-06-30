package JavaArray.Array03.prob;

public class Prob2 {

    public static void main(String[] args) {
        System.out.println("<< 생성된 난수 >> ");
        int[] arr = generatedRandom();

        System.out.println();
        System.out.println("================================");

        int max =getMaxNum(arr);
        System.out.println("배열에서 가장 큰 숫자 : " + max);


    }

    public static int[] generatedRandom(){
        int[] arr = new int[10];

        for(int i : arr){
            i = (int)((Math.random() * 30 + 1));
            System.out.print(i + ", ");
        }
        return arr;
    }

    public static int getMaxNum(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
