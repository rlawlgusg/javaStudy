/*�迭�߿��� ���� ū �� ã��
1.���� ū���� ã�� �����ϱ� ���� max��� ���� ����
2.�迭�� �� ù��° ��Ҹ� �ϴ� max��� ����
3.�ݺ����� �̿��Ͽ� �迭�� �ι�° ��Һ��� max�� ������ ���Ͽ� ���ϴ� �迭�� ���� max���� �� ũ�ٸ� �� �迭�� ���� max��� ����
*/

class MaxOfArray 
{
	public static void main(String[] args) 
	{
		int []arr = {9,3,7,15,2};
		int max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.print("�迭�߿� ���� ū ���� "+max);
		
	}
}
