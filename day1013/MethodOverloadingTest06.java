//������ �迭�� �Ű������� ���޹޾� ������ ���Ͽ� ��ȯ�ϴ� �޼ҵ��
//�Ǽ��� �迭�� �Ű������� ���޹޾� ������ ���Ͽ� ��ȯ�ϴ� �޼ҵ带
//�ߺ��Ͽ� �����ϰ� ȣ��
class MethodOverloading{
	
	/*
	public static int total(int []a){
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	*/

	public static int total(int []a){
		int sum = 0;
		for(int i:a){
			sum +=i;
		}
		return sum;
	}

	public static double total(double []a){
		double sum = 0;
		for(double i:a){
			sum +=i;
		}
		return sum;
	}



}

class MethodOverloadingTest06
  
{
	public static void main(String[] args) 
	{
		int []arr1 = {10,20,30,40};
		double []arr2 = {10.5,20.7,35.6,62.8,80.5,93.7};//�迭�� ����ٰ�!

		System.out.printf("������ �迭�� ����: %d\n",MethodOverloading.total(arr1));
		System.out.printf("�Ǽ��� �迭�� ����: %.1f\n",MethodOverloading.total(arr2));
	}
}
