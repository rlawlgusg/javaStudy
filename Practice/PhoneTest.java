class Phone{
	
	String color;
	String os;
	int volume;
	
	void ring(){
		System.out.println("��ȭ���� �︳�ϴ�");
	}
	
	void message(){
		System.out.println("�޼����� �����ϴ�");
	}


	void volumeup(){
		volume++;
	}

	void volumedown(){
		volume--;
	}

	void picture(){
		System.out.println("������ ����ϴ�");
	}
	
}


class PhoneTest
{
	public static void main(String[] args) 
	{
		Phone p = new Phone();
		p.color = "���";
		p.os = "�ȵ���̵�";
		
	    p.volume = 7;
		p.volumeup();
		System.out.println(p.volume);
		p.picture();
		p.ring();
		p.message();
	}
}
