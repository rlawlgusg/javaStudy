class MyUtil{
	static void gugudan(int dan){ //static�� �ٿ��� ��ü�� ������ �ʾƵ� ��!
		System.out.printf("***%d��***\n",dan);
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	} 
}  
/*
������ � �޼ҵ带 ����Ϸ��� �� �޼Ұ� �ִ� Ŭ������ ��ü�� �����ϰ� �� ��ü�� ���ؼ� �޼ҵ带 ȣ����
�׷��� �� �޼ҵ尡 static�̶�� ��ü�� ������ �ʰ� �ٷ� Ŭ���� �̸��� ��밡��
*/

class MethodTest02{
	public static void main(String []args){
		
		MyUtil.gugudan(9); //��� �ٷ� Ŭ���� �̸��� �����ش�
		System.out.println("===========================");
		MyUtil.gugudan(10);
	}
}