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
		System.out.println("�̸�: "+ name);
	}

}


class StaticTest03
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";//��ü �������� �ʾƵ� �� �� ���� Ŭ���������ϱ�
		System.out.println("�ּ�: "+ Family.addr);
		
		Family.pro();//static �޼ҵ� ȣ�� 
		
		
	}
}
/*
StaticTest03.java:25: error: non-static variable name cannot be referenced from a static context
                System.out.println("�̸�: "+ name);
                                           ^
1 error

stactic �޼ҵ忡���� static������� ���ٰ���

*/
