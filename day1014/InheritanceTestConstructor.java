class A{
	public A(){
		System.out.println("A�� ������ ������");
	}
}

class B extends A{
	public B(){
		super();//�θ�Ŭ������ �⺻�����ڸ� �䱸
		System.out.println("B�� ������ ������");
	}
}

class InheritanceTestConstructor 
{
	public static void main(String[] args) 
	{
		B ob = new B();
		//�ڽ�Ŭ������ ��ü�� ���� �����ϸ� �θ��� �����ڰ� ���� ����
		
	}
}
/*
�ڽ�Ŭ������ B�� ��ü�� �����ϸ� �θ�Ŭ������ A�� �����ڰ� ���� �����ϰ�
�ڽ�Ŭ������ B�� �����ڰ� ���ʷ� ������
�ڽ�Ŭ������ B�� �������� ù��° �ٿ� �θ�Ŭ������ �⺻�����ڸ� �䱸�ϴ� super();
�� �����Ǿ��ֽ��ϴ�! 
*/