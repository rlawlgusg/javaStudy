class Dog{
	
	private String name;
	public String breed;
	private int age; 
	//���� �Ӽ����� private�� �ΰ� �޼ҵ���� public�� �δ°� �Ϲ��������� ������ �ʾƵ���.. 
	
	public Dog(String name,int age,String breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String toString(){
		return "�������� �̸��� "+name+" ���̴� "+age+" ������ "+breed;
	}

	
}


class DefaultConstructor02 
{
	public static void main(String[] args) 
	{

		Dog d1 = new Dog();
		System.out.println(d1);


	}
}
/*
C:\javaStudy\day1013>javac DefaultConstructor02.java
DefaultConstructor02.java:27: error: constructor Dog in class Dog cannot be applied to given types;
                Dog d1 = new Dog();
                         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

����ڰ� �����ڸ� ������� ������ �⺻�����ڰ� �������� ����
�Ű������� ��� ���� �����ڸ� ����ϴ��� �ʿ��ϴٸ� �Ű������� ���� �ʴ� �����ڸ� ����ڰ� ������־����

������ �����ڸ� ���鶧���� �ݵ�� �⺻ �����ڵ� ����� �ּ���!
*/