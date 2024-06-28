package JavaArray.Array01.prob;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};

		int iaOddSum = 0;
		int iaEvenSum = 0;
		int ibOddSum = 0;
		int ibEvenSum = 0;

		for(int i : ia){
			if( i % 2 == 0){
				iaEvenSum += i;
			}else {
				iaOddSum += i;
			}
		}

		for(int i : ib){
			if( i % 2 == 0){
				ibEvenSum += i;
			}else {
				ibOddSum += i;
			}
		}

		System.out.println(" ( 배열 ia ) ");
		System.out.println(" 홀수 합 : " + iaOddSum);
		System.out.println(" 짝수 합 : " + iaEvenSum);
		System.out.println("-------------");
		System.out.println(" ( 배열 ib ) ");
		System.out.println(" 홀수 합 : " + ibOddSum);
		System.out.println(" 짝수 합 : " + ibEvenSum);

	}
	
	
}
