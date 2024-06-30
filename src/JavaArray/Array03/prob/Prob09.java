package JavaArray.Array03.prob;

public class Prob09 {
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
		System.out.println("==================================");

		for (int i = 0; i < 5 ; i++){
			for (int j = 0; j < 5; j++){
				System.out.print(alphabet[i][j] + " ");
			}
			System.out.println();
		}

		//3. 배열 수정
		for(int i = 0; i < 5; i++){
			alphabet[i][i] = '*';
		}

		//4. 수정된 배열 출력
		System.out.println("              수정된 배열");
		System.out.println("==================================");

		for (int i = 0; i < 5 ; i++){
			for (int j = 0; j < 5; j++){
				System.out.print(alphabet[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
