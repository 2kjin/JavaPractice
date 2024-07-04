package Polymorphism._03;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);

		System.out.println("총 판매 금액==>"+ getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+ Coffee.getAmount() +"잔");
		System.out.println("Tea의 판매 개수=>"+ Tea.getAmount() +"잔");
	}

	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
	private static void getSalesInfo(Beverage[] beverages) {
		for (int i = 1; i <= beverages.length; i++) {
			beverages[i-1].calcPrice();
			System.out.println(i + "번째 판매음료는 " +  beverages[i-1].getName() +"이며, 가격은 " + beverages[i-1].getPrice());
		}
	}

	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
		private static int getTotalPrice(Beverage[] beverages) {
			int sum = 0;
			for (Beverage b : beverages) {
				sum += b.getPrice();

			}
			return sum;
		}
}
