package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp() {
		System.out.println("Connect WhatsApp");
	
	}
	public void takeVideo() {
		System.out.println("Take Video in Smartphone");
		
	}


	public static void main(String[] args) {
		SmartPhone SP=new SmartPhone();
		SP.sendMsg();
		SP.makeCall();
		SP.saveContact();
		SP.takeVideo();
		SP.connectWhatsapp();

	}

}
