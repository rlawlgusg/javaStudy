/*
�޼ҵ� ȣ��ÿ� �迭���������� ��ü���������� ���޵Ǵ� ��츦 ������ ���� ȣ���̶�� �ϰ�,
�޼ҵ� ȣ��ÿ� �������� ������ �޼ҵ� �ȿ��� ����� ���� ȣ�����ʿ��� ������ �ȴ�
*/


class CallByReferenceArray //������ ���� ȣ��(�迭)
{
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� ����ϴ� �޼ҵ带 ����
	public static void PrintArray(int []arr){
		for(int i=0 ; i<arr.length ; i++){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}

	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� 1�� �����ϴ� �޼ҵ带 ����
	public static void PlusOne(int []arr){
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = arr[i] + 1;
		}
	}

	public static void main(String[] args) 
	{
		int []arr = {10,20,30};//�迭�� �̸��� �޼ҵ�� ���Ƶ� �޶� ��� ����
		PrintArray(arr);//arr�� ��������!! 
		PlusOne(arr);
		PrintArray(arr);
		
	}
}
