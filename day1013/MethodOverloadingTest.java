class SistUtil{
	//�ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public void max(int a,int b){
		int m = a;
		if(b > m){
			m = b;
		}
			System.out.println("ū���� "+m+"�Դϴ�");
	}
	//�ΰ��� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("ū���� "+m+"�Դϴ�");
		

	}
}
class MethodOverloadingTest 
{
	public static void main(String[] args) 
	{
		
		SistUtil s1 = new SistUtil();
		SistUtil s2 = new SistUtil();
		s1.max(3,5);
		s2.max(3.2,7.5);

	}
}
//�Ӽ��� ��������� ����! ��ü�� ���� �ʿ䰡 ����! static ����ϴ°� ����