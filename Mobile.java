package week3.day1;

public class Mobile {
	
	public void sendMsg() {
		System.out.println("Send Message");
		
	}
	public void makeCall() {
	System.out.println("Make Call");	
	}
	public void saveContact() {
		System.out.println("Save Contact");
	}
	public void takeVideo() {
		System.out.println("Take video in Mobile");
		
	}

	public static void main(String[] args) {
	Mobile M=new Mobile();
		M.takeVideo();
	}

}
