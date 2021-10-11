class Phone{
	
	String color;
	String os;
	int volume;
	
	void ring(){
		System.out.println("전화벨이 울립니다");
	}
	
	void message(){
		System.out.println("메세지를 보냅니다");
	}


	void volumeup(){
		volume++;
	}

	void volumedown(){
		volume--;
	}

	void picture(){
		System.out.println("사진을 찍습니다");
	}
	
}


class PhoneTest
{
	public static void main(String[] args) 
	{
		Phone p = new Phone();
		p.color = "흰색";
		p.os = "안드로이드";
		
	    p.volume = 7;
		p.volumeup();
		System.out.println(p.volume);
		p.picture();
		p.ring();
		p.message();
	}
}
