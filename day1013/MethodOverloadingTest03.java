class SistUtil{
	
	public static void max(int a,int b){
		max((double)a,(double)b);//�ʿ��ϴٸ� �޼ҵ� �ȿ��� ������ �ٸ� �޼ҵ带 ȣ���� �� ����
	}

	public static void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("ū���� "+m+"�Դϴ�");
		

	}
}
class MethodOverloadingTest03
{
	public static void main(String[] args) 
	{
		SistUtil.max(10,20);
		SistUtil.max(3.5,4.7);

	}
}
