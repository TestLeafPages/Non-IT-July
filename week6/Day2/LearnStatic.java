package week6day2;

public class LearnStatic {

	int x=10;
	static int y=20;
	
	public void method2() {
		int z=30+x;
		System.out.println(z);
		System.out.println("I am from normal method");
	}
	
	public static void main(String[] args) {
		System.out.println("I am from main method");
		LearnStatic s=new LearnStatic();
		int x2 = s.x;
        System.out.println(x2);
        System.out.println(y);
        int n = LearnFinal.n;

	}

}
