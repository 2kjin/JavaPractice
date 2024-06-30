package JavaArray.Array03.prob;

public class Prob8 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int num = 1;

        for(int i = 0 ; i < 5 ; i++){
            for (int j = 4; j >=0 ; j--){
                arr[i][j] = num++;
            }
        }

        for(int i = 0; i < 5; i++){
            for (int j = 0 ; j < 5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
