import java.util.Scanner;
class ProgrammingArray01 
{
	
	public static void main(String[] args) 
	{
	
		double []cost=new double[12];
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<cost.length;i++){
				do{
				System.out.printf("%d���� ī�� ���ݾ��� �Է��Ͻÿ�\n",i+1);
				cost[i] = sc.nextDouble();
				}while(cost[i] < 0);
			sum += cost[i]; // �ùٸ� �ݾ��� �Է��Ͽ����� �������ͼ� ����
			}
	
		double avg = sum/12; // == sum/cost.length
		
		double max = cost[0];
		double min = cost[0];
		int max_month = 0; // �ִ��� �ִ� �ε����� �ִ´�
		int min_month = 0; //�ε����� ã��! �ε��� = month
		for(int i = 1;i<cost.length;i++){
			if(max < cost[i]){
				max = cost[i];
				max_month = i;
			}
			if(min > cost[i]){
				min = cost[i];
				min_month = i;
			}
		}
		
	
			
		System.out.printf("1�⵿���� ��ü ���ݾ��� %.1f�Դϴ�\n",sum);//%d�� ���� %f�� �Ǽ�.. �Ҽ������� �ڸ� ����.n
		System.out.printf("���� ��� ���ݾ��� %.1f�Դϴ�\n",avg);//.1�� �Ҽ��� ù°�ڸ����� .2�� �Ҽ��� ��°�ڸ�����..
		System.out.printf("���� ������ ���Ҵ� ���� %d�Դϴ�\n",max_month+1);
		System.out.printf("���� ������ ������ ���� %d�Դϴ�\n",min_month+1);



	}
}
