class EqualArray03
{
	public static void main(String[] args) 
	{
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		//Index 5 out of bounds for length 5

		int [] b = {1,2,3,4,5};

		if(a.length != b.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return; // ���� �޼ҵ带 �����!
		}
		//�� �ڿ� ����Ǵ� ��� a.length�� b.length�� ������쿡��
	
		boolean flag = true; 
		//boolean�� ����Ͽ� �迭 �߰��� Ʋ������ �ִٸ� �ٷ� for������ Ż��
		
		for(int i=0;i<a.length;i++){
			if(a[i] != b[i]){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("�迭�� ������ ��ġ�մϴ�");
		}else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�");
		}

			

		

		
		
	}
}
