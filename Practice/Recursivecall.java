/*
���ȣ��
1.�޼ҵ� ������ �ڱ��ڽ��� �ݺ������� ȣ��
2.�ݺ������� �ٲ� �� ����
3.�ݺ������� ������ ������..
4.���� ���� ������ �ڵ� �ۼ�����
5.����Լ����·� ���� ��� ex)���丮��!, ����
*/
class Recursivecall
{
	public int factorial(int f){
		if(f == 1){
			return 1;
		}else 
			return f * factorial(f-1);
	}

	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}
}
