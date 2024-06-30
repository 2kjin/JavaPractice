package JavaArray.Array02;

public class Exam02_0422 {
	public static void main(String[] args) {

		char[][] alphabet = new char[5][5];
		char start='A';

		//1. 배열에 알파벳 입력
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				alphabet[i][j] = start++;
			}
		}

		//2.원본에 배열 출력
		System.out.println("              원본 배열");
		prrintArr(alphabet);

		//3. 배열 수정
		for(int i = 0; i < 5; i++){
			alphabet[i][i] = '*';
		}

		//4. 수정된 배열 출력
		System.out.println("              수정된 배열");
		prrintArr(alphabet);

	}

	public static void prrintArr(char[][] arr){
		System.out.println("==================================");

		for (int i = 0; i < 5 ; i++){
			for (int j = 0; j < 5; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
