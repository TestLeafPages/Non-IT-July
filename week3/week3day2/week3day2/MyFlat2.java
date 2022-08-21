package week3day2;

public class MyFlat2 extends Appartment{

	public void terrace() {
		System.out.println("Friends chat");
	}

	public void serviceArea() {
		System.out.println("Store Room");
	}

	public static void main(String[] args) {
		MyFlat2 call = new MyFlat2();
		call.flats();
		call.park();
		call.serviceArea();
		call.terrace();
		int z = IndividualBuyer.x;//Classname.variablename
		System.out.println(z);
	}

}
