class A{
	public A(int i){ //�⺻�����ڰ� ��������� �ʾƼ� ������!
		System.out.println("A�� ������ ������");
	}
}

class B extends A{
	public B(){
		System.out.println("B�� ������ ������");
	}
}

class InheritanceTestConstructor02
{
	public static void main(String[] args) 
	{
		B ob = new B();
		//�ڽ�Ŭ������ ��ü�� ���� �����ϸ� �θ��� �����ڰ� ���� ����
		
	}
}
/*
InheritanceTestConstructor02.java:8: error: constructor A in class A cannot be applied to given types;
                super();//�θ�Ŭ������ �⺻�����ڸ� �䱸
                ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

�ڽ�Ŭ���� �������� ù��° �ٿ��� �θ�Ŭ������ �⺻�����ڸ� �䱸�ϴ� super()�� �����Ǿ��ֽ��ϴ�
�׷��� �θ�Ŭ������ AŬ������ �⺻�����ڰ� �����Ƿ� ������ �߻��� 
*/