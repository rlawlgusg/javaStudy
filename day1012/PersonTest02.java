class Person{
	
	private String name;
	private int age;

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setAge(int a){
		age = a;
	}

	public int getAge(){
		return age;
	}


}


class PersonTest02
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(); 
		//p1.name = "ȫ�浿";
		//p1.age = 20;
		p1.setName("ȫ�浿");
		p1.setAge(20);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
/*
PersonTest02.java:14: error: name has private access in Person
                p1.name = "ȫ�浿";
                  ^
PersonTest02.java:15: error: age has private access in Person
                p1.age = 20;
                  ^
PersonTest02.java:16: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:17: error: age has private access in Person
                System.out.println(p1.age);

personŬ������ private������ �Ӽ�(�������)�� ���� ������ �� ����
������ �� �ִ� �޼ҵ带 public�� ����� �ΰ� ����ؾ���!
�����ؼ� ���� �����ϴ� �޼ҵ�� setXXX()�� ����� �����ؼ� ���� �о���� �޼ҵ�� getXXX()�� ����
�̰��� setter, getter��� �θ�
���� Ŭ������ ���鶧�� ������ ��� ����������� private������ �ΰ� �� private���￡ ��������� �����ϱ� ����
setter, getter�� public�� ��� ������ ��!!!

setter�� ������� ���� �����ϱ� ���� �޼ҵ��̴� ������� �ٲ��� �ް������� �ʿ��ϰ� ��ȯ���� ���� 
getter�� �Ű������� �ʿ���� ��������� ���� ��ȯ�ϴ� �޼ҵ��̴� ��ȯ���� ����!!
*/