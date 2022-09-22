package week6day2;

public class LearnConstructor {

	int x;
	String name;
	float y;

	public LearnConstructor() {
		System.out.println("I am default cons");

	}

	public LearnConstructor(String name) {
		this();
		System.out.println(name);

	}
	public LearnConstructor(String name, float height) {
		this("Hari");
		System.out.println(name);

	}

	public static void main(String[] args) {

		LearnConstructor obj = new LearnConstructor();
		LearnConstructor obj1 = new LearnConstructor("Vidya", 5.5f);
		System.out.println(obj.x);
		System.out.println(obj.name);
		System.out.println(obj1.y);



	}

}
