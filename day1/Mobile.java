package week1.day1;

public class Mobile {
	void makeCall()
	{
		String mobileModel="Vivo";
		float mobileweight=12.2f;
		System.out.println("Making call");
	}
	void sendMsg()
	{
		boolean isFullCharged=true;
		int mobileCost=15000;
		System.out.println("Sending Msg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");

	}

}
