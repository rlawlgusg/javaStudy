/*
���α׷� ����ÿ� �ΰ��� ������ ���޹޾� �������� ����� ����ϴ� ���α׷� �ۼ�
���α׷� ����ÿ� �ʿ��ϴٸ� �� ���α׷� ���࿡ �ʿ��� ���� ������ �� ����!
�̷��� �����ϴ� ���� main �޼ҵ��� �Ű����� �迭�� ���ް���
������ �� ��ŭ �迭�� ũ�Ⱑ �������� ���ʴ�� 0��° ��Һ��� ���̰� �� 
java DiveTest 4 2 

*/
class  DivTestTryCatch02
{
	public static void main(String[] args) 
	{
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("���: "+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����ÿ� �������� �μ��� �����ϼ���");
		}catch(ArithmeticException a){
			System.out.println("0���� ���� ���� �����");
		}catch(NumberFormatException i){
			System.out.println("���ڸ� �Է��ϼ���");
		}


	}
}