class Family{
	
	public String name;
	private int age;
	private String role;

	public static String addr; 
	//Ŭ���� ����!! �������϶�.. �ϸ� ��κ� public, static�̱⶧���� ��ü�� ������� �ʰ� ����
	
	public Family(String name, int age, String role){
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public Family(){	
	}//���������� �⺻�����ڸ� ������־�� �Ѵ�!

	public String toString(){
		return "[name: "+name+" age: "+age+" role :"+role+" addr :"+addr+"]";
	}
	
	public static void pro(){ //��ȯ���� ������ void 
		System.out.println("�ּ�: "+ addr);
	}

}


class StaticTest02
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";//��ü �������� �ʾƵ� �� �� ���� Ŭ���������ϱ�
		System.out.println("�ּ�: "+ Family.addr);
		
		Family.pro();//static �޼ҵ� ȣ�� 
		Family.toString();//���� 
		
	}
}

/*
StaticTest02.java:38: error: non-static method toString() cannot be referenced from a static context
                Family.toString();

static�޼ҵ尡 �ƴѰ��� Ŭ���� �̸����� ����� �� �����!
*/