package Chapter5;

public class bus {

static	int discount = 1200;
	public bus() {
		
	}

	
	public static int reader (int bus_card) {
		bus_card = bus_card - discount;
		
		System.out.println("잔액은"+bus_card+"입니다!");
		
		return bus_card;
	}
}
