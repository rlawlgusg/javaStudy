class CopyArray02 //�迭�� ������������ ������ ����ȉ� �⺻��:���� ������ ����
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];

		
		for(int i = 0;i<a.length;i++){
				b[i] = a[i];
				System.out.print(b[i]);
			}
		
	



		a[0] = 100;
		
		System.out.println("a�迭�� ���");
		for (int i:a){//�̶� i�� �ε����� �ƴ϶� a�迭�� �ִ� ��Ҹ� �ϳ��� ������ 
			System.out.printf("%5d",i);
		}
		System.out.println();

		System.out.println("b�迭�� ���");
		for (int i:b){//�̶� i�� �ε����� �ƴ϶� a�迭�� �ִ� ��Ҹ� �ϳ��� ������ 
			System.out.printf("%5d",i);
		}




	}
}
