package com.sist.exam08;

class Person{
	public String name = "ȫ�浿";
	public static final String addr = "����� ������ ������";

	//�ٲ����� ���ϴ� final�� ���� ��ü���� ���� �޸𸮸� Ȯ���� �ʿ䰡 ����
	//�׷��� final����� static���� ����°��� ���ڴ�....
	
	//final�� static���� ������!
	//static�� final�� ������! X >>static�� ���� �� �� ����!!!
}


public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Person.addr);
		
		Person father = new Person();
		Person son = new Person();
		
		father.name = "ȫ�浿";
		father.name = "ȫ�ν�";
		
		System.out.println(father.name +","+father.addr);
		System.out.println(son.name + ","+son.addr);
		//static�� ��ü ������ ���ٰ��� ,��� Ŭ�����̸����� ���ٰ���
		

	}

}
