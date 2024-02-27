
public class Mobile {
	String brand;
	String color;
	int cost;
	
	public Mobile(String brand, String color, int cost) {
		//shadowing Problem
//		brand=brand; //Error
//		color=color; //Error
//		cost=cost; //Error
		
		//solution to shadowing problem
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	void allowToCall() {
		System.out.println("Tring... Tring... Calling...");
	}
		
}

