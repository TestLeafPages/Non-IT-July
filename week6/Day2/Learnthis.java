package week6day2;

public class Learnthis {
	
	String CompanyName="tl";
	
	
	public void employee(String CompanyName,int id) {
	this.CompanyName=CompanyName;
	 System.out.println(CompanyName);
		
	}
	//value of local variable can be assigned the global variable  -->both having same variablename

	public static void main(String[] args) {
		Learnthis obj=new Learnthis();
		obj.employee("Testleaf", 12);
		String companyName2 = obj.CompanyName;
		System.out.println(companyName2);
		int y = LearnStatic.y;
		System.out.println(y+10);
	

	}

}
