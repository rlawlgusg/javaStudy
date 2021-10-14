class MyUtil{
	//������ �迭 �ΰ��� �Ű������� ���޹޾� �ϳ��� ���� ��ȯ�ϴ� �޼ҵ�����
	public static int[] unionArray(int []a,int []b){
		int []result = new int[a.length+b.length];
		int i;
		for(i=0;i<a.length;i++){
			result[i]=a[i];
		}
		for(int j=0;j<b.length;j++){
			result[i++]=b[j]; //�ۿ� �ִ� �Ű������� Ż���������� �ε��� ����
		}
		return result;
	}
	//�Ǽ��� �迭 �ΰ��� �Ű������� ���޹޾� �ϳ��� ���� ��ȯ�ϴ� �޼ҵ�����
	public static double[] unionArray(double []a,double []b){
		double []result = new double[a.length+b.length];
		int i;//for���ۿ����� i�� ����ϰ� �����ϱ� ���� ����
		for(i=0;i<a.length;i++){
			result[i]=a[i];
		}
		for(int j=0;j<b.length;j++){
			result[i+j]=b[j];
		}
		return result;
	}
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��Ҹ� ��� ����ϴ� �޼ҵ�
	public static void printArray(int []arr){
		for(int i:arr){
			System.out.printf("%10d",i);
		}
		System.out.println();
	}

	//�Ǽ��� �迭�� �Ű������� ���޹޾� �迭�� ��Ҹ� ��� ����ϴ� �޼ҵ�
	public static void printArray(double []arr){
		for(double i:arr){
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}


}


class Exam01 
{
	public static void main(String[] args) 
	{
		int []a={10,20,30};
		int []b={40,50,60,70};

		double []c={2.7, 6.9, 3.2};
		double []d={1.4, 5.8};

		int []arr1 = MyUtil.unionArray(a,b);
		double []arr2 = MyUtil.unionArray(c,d);
		
		MyUtil.printArray(arr1);
		MyUtil.printArray(arr2);

	}
}
