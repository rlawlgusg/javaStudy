class ForEachTest 
{
	public static void main(String[] args) 
	{
		
		String []name = {"������","������","�ӻ���","���Ͽ�","���ڿ�","����ȣ"};
		/*
		//for each�ݺ����� �̿��Ͽ� �迭�� ��Ҹ� ��� ����غ�
		for(String n:name){ //������ n�� �����͸� ��� ������ �ǹ�!
			System.out.println(n);
		}
		*/
		for(int i=0;i<name.length;i++){ //������ i�� ����Ÿ�� �ε����� �ǹ�
			System.out.println(name[i]);
		}
		
	}
}
