class Dog{
	
	private String name;
	public String breed;
	private int age; 
	//���� �Ӽ����� private�� �ΰ� �޼ҵ���� public�� �δ°� �Ϲ��������� ������ �ʾƵ���.. 

	public String toString(){
		return "�������� �̸��� "+name+" ���̴� "+age+" ������ "+breed;
	}

	
}


class DefaultConstructor01 
{
	public static void main(String[] args) 
	{

		Dog d1 = new Dog();
		System.out.println(d1);


	}
}
//�������� �̸��� null ���̴� 0 ������ null
//����ڰ� �����ڸ� �Ѱ��� ������ ���� ���� �ڹٴ� �⺻�����ڸ� �ڵ����� �����Ѵ�!