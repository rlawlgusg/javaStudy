class MyUtil{
	static int getmax(int a, int b){
		int max = a;		
		if(b > max){
			max = b;
		}
		return max;//max�� ȣ���� ������ ���ư�����!!!!!!!!!!!1
	} 
}  
/*
������ � �޼ҵ带 ����Ϸ��� �� �޼Ұ� �ִ� Ŭ������ ��ü�� �����ϰ� �� ��ü�� ���ؼ� �޼ҵ带 ȣ����
�׷��� �� �޼ҵ尡 static�̶�� ��ü�� ������ �ʰ� �ٷ� Ŭ���� �̸��� ��밡��
*/

class MethodTestMax{
	public static void main(String []args){
		int age1 = 26;
		int age2 = 28;
		int result;
		result = MyUtil.getmax(age1,age2); //ȣ���Ѱ����� ���ƿ�..
		System.out.println(result);//max�� ��ȯ
	}
}