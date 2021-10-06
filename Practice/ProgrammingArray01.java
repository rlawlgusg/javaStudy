import java.util.Scanner;
class ProgrammingArray01 
{
	
	public static void main(String[] args) 
	{
	
		double []cost=new double[12];
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<cost.length;i++){
			System.out.printf("%d월의 카드 사용금액을 입력하시오\n",i+1);
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
		
			
		System.out.printf("1년동안의 전체 사용금액은 %.1f입니다\n",sum);
		System.out.printf("월별 평균 사용금액은 %.1f입니다\n",avg);
		System.out.printf("가장 지출이 많았던 월은 %.1f입니다\n",max);
		System.out.printf("가장 지출이 적었던 월은 %.1f입니다\n",min);



	}
}
