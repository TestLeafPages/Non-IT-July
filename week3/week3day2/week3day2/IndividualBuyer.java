package week3day2;

public class IndividualBuyer extends Appartment implements Land, Government {

	static final int x=15;
	
	
	
	
	public void landtoBuy() {
		
		System.out.println("my individaul plot");
	}

	public void playGround() {
		System.out.println("Playground");
	}

	public void malls() {
		System.out.println("Plots to build mall");
	}

	public void registrationAmount() {
		System.out.println("2lakh");
	}

	public void commonArea() {
		System.out.println("Park");
	}
	
	public void serviceArea() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualBuyer house = new IndividualBuyer();
		house.malls();
		house.landtoBuy();
		house.playGround();

		System.out.println(x);
	
	}

	

}
