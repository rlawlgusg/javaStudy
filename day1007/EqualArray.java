class EqualArray
{
	public static void main(String[] args) 
	{
		
		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3,4,5,6,7,8,9,10};
		
		
		/*
		for(int i=0;i<a.length;i++){
			if(a[i]==b[i]){
				System.out.println("�迭�� ������ ��ġ�մϴ�");
				break;
			}else
				System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�");
				break;
		}
		*/
		
		
		boolean flag = true; 
		//boolean�� ����Ͽ� �迭 �߰��� Ʋ������ �ִٸ� �ٷ� for������ Ż��
		
		
			for(int i=0;i<a.length;i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}
				if(flag && a.length == b.length){
					System.out.println("�迭�� ������ ��ġ�մϴ�");
				}else{
					System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�");
				}

			

		

		
		
	}
}
