//���� �ΰ��� �Ű������� ���޹޾� ū ���� ã�� ��ȯ�ϴ� �޼ҵ�,
//���� ������ �Ű������� ���޹޾� ū ���� ã�� ��ȯ�ϴ� �޼ҵ�,
//���� �װ��� �Ű������� ���޹޾� ū ���� ã�� ��ȯ�ϴ� �޼ҵ�,
//�ߺ��Ͽ� �����ϰ� ������ ȣ��
class MethodOverloading{
	public static int max(int a,int b){
		int max = a;
		if(b > max){
			max = b;
		}
			return max;
	}
	public static int max(int a,int b,int c){
		return max(max(a,b),c); //�޼ҵ�ȿ��� �޼ҵ带 ȣ����
		
	}
	public static int max(int a,int b,int c,int d){
		return max(max(a,b),max(c,d));
	}

}

class MethodOverloadingTest05 
{
	public static void main(String[] args) 
	{
		
		System.out.println("ū���� "+MethodOverloading.max(3,5));
		System.out.println("ū���� "+MethodOverloading.max(3,5,2));
		System.out.println("ū���� "+MethodOverloading.max(3,5,6,7));
	}
}
