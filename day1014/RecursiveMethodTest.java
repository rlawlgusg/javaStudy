class RecursiveMethodTest 
{
	//n�� �Ű������� ���޹޾� n!�� ���Ͽ� ��ȯ�ϴ� �޼ҵ带 ���ȣ��� �̿��Ͽ� ����
	public static int getFactorial(int n){
		if(n==1){
			return 1;
		}//�޼ҵ��� ���ҿ� ���� ������ ������ �ٸ� �� ����
		return n * getFactorial(n-1);
	}

	public static void main(String[] args) 
	{
		System.out.printf("5! = %d\n",getFactorial(5));
		System.out.printf("7! = %d\n",getFactorial(7));

	}
}
