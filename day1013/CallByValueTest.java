/*
���� ���� ȣ��(Call by Value)
�޼ҵ� ȣ��ÿ� �⺻�ڷ����� ���޵Ǵ� ��츦 ���ϸ� �޼ҵ� �ȿ��� ���޵� ������ ����Ǵ��� ȣ���ϴ� �ʿ�����
������� ���� 
*/
class CallByValueTest 
{
	public static void PlusOne(int n){
		n = n+1;
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		int data = 100;
		PlusOne(data);//101
		System.out.println(data);//100
	}
}
