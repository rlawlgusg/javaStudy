class SistUtil{
	
	public static void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("ū���� "+m+"�Դϴ�");
		

	}
}
class MethodOverloadingTest04
{
	public static void main(String[] args) 
	{
		SistUtil.max(10,20);
		//�� �´� int�� ���� �޼ҵ尡 ������ �ű�� ������ ���ٸ� double�� int�� �����ϴϱ� double�� ���� �޼ҵ尡 ������
		SistUtil.max(3.5,4.7);

	}
}
