package week1.day1;

public class Executionclass {
	public static void main(String[] args) {
		
		
		MyMobile mymobile=new MyMobile();
		FriendMobile friendMobile= new FriendMobile();
		mymobile.makeCalls();
		mymobile.typeMessages();
		
		friendMobile.makeTransaction();
		friendMobile.takePhotos();
	}
}
