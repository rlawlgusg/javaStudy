import java.util.Scanner;
class ProgrammingArray01 
{
	
	public static void main(String[] args) 
	{
	
		double []cost=new double[12];
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<cost.length;i++){
			System.out.printf("%d���� ī�� ���ݾ��� �Է��Ͻÿ�\n",i+1);
			cost[i] = sc.nextDouble();
			sum += cost[i];
			}
	
		double avg = sum/12;
		
		double max = cost[0];
		for(int i = 1;i<cost.length;i++){
			if(max < cost[i]){
				max = cost[i];
			}
		}
		double min = cost[0];
		for(int i = 1;i<cost.length;i++){
			if(min > cost[i]){
				min = cost[i];
			}
		}
		
			
		System.out.printf("1�⵿���� ��ü ���ݾ��� %.1f�Դϴ�\n",sum);
		System.out.printf("���� ��� ���ݾ��� %.1f�Դϴ�\n",avg);
		System.out.printf("���� ������ ���Ҵ� ���� %.1f�Դϴ�\n",max);
		System.out.printf("���� ������ ������ ���� %.1f�Դϴ�\n",min);



	}
}
