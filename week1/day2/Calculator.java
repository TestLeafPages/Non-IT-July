package week1.day2;

public class Calculator {

	public int add(int a, int b) {
		int z=a+b;
		System.out.println(z);
		return z;//=15;
	}

	public void sub(int x, float y) {
		float z=x-y;
		System.out.println(z);
	}

	public void mul(int i, int j) {
		int k=i*j;
		System.out.println(k);
	}

	public void div(int l, int m) {
		int n=l/m;
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator fn=new Calculator();
	    int add = fn.add(10,5);//15	  	
		fn.sub(12, 2.5f);
		fn.mul(34,3);
		fn.div(add, 5);
			
	}

}
