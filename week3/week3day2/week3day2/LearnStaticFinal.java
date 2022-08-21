package week3day2;

public class LearnStaticFinal {
	static int a=0;
	 static int x=0;
	 
	public static void add() {
		a++;
		x=15;
		System.out.println(x);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnStaticFinal sf=new LearnStaticFinal();
		System.out.println(sf.x);
		System.out.println(LearnStaticFinal.a);
	    add();
	}

}
