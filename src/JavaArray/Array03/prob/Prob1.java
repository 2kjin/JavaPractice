package JavaArray.Array03.prob;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		Prob1 p = new Prob1();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열ib )");
		p.calc(ib);
	}
	
	public void calc(int[] ix){
		
		// 구현하시오.----------------------------- 
		int OddSum = 0;
		int EvenSum = 0;

		for(int i : ix){
			if( i % 2 == 0){
				EvenSum += i;
			}else {
				OddSum += i;
			}
		}

		System.out.println(" 홀수 합 : " + OddSum);
		System.out.println(" 짝수 합 : " + EvenSum);

		//---------------------------------------
		
	}
}
