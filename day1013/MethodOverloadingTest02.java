class SistUtil{
	//�ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public static void max(int a,int b){
		int m = a;
		if(b > m){
			m = b;
		}
			System.out.println("ū���� "+m+"�Դϴ�");
	}
	//�ΰ��� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public static void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("ū���� "+m+"�Դϴ�");
		

	}
}
class MethodOverloadingTest02
{
	public static void main(String[] args) 
	{
		SistUtil.max(10,20);
		SistUtil.max(3.5,4.7);

	}
}
