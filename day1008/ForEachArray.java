class ForEachArray 
{
	public static void main(String[] args) 
	{
		int []data = {1,2,3,4,5};
		
		for(int i:data){
		//	System.out.println(i); //for-each�ݺ������� i�� �迭�� ��Ҹ� �ϳ��� ������ 
			System.out.println(data[i]);//i��ü�� �迭�� ���� ���� ���µ� �װ��� �ε����� ���� ����..
		}
		
		/*
		for(int i = 0 ;i< data.length ; i++){
			System.out.println(data[i]);
		}
		*/
		
	}
}
