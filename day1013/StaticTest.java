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


}


class StaticTest 
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";//��ü �������� �ʾƵ� �� �� ���� Ŭ���������ϱ�
		System.out.println("�ּ�: "+ Family.addr);
		
		/*
		Family.name = "ȫ�浿";
		System.out.println("�̸�: "+ Family.name);
		*/

	}
}

/*
StaticTest.java:34: error: non-static variable name cannot be referenced from a static context
                Family.name = "ȫ�浿";
                      ^
StaticTest.java:35: error: non-static variable name cannot be referenced from a static context
                System.out.println("�̸�: "+ Family.name);
                                                 ^
2 errors

static ����� �ƴѰ��� Ŭ�����̸����� ������ �� ����! 

*/