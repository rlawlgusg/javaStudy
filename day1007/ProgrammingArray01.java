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
				System.out.printf("%d월의 카드 사용금액을 입력하시오\n",i+1);
				cost[i] = sc.nextDouble();
				}while(cost[i] < 0);
			sum += cost[i]; // 올바른 금액을 입력하였을때 빠져나와서 누적
			}
	
		double avg = sum/12; // == sum/cost.length
		
		double max = cost[0];
		double min = cost[0];
		int max_month = 0; // 최댓값이 있는 인덱스를 넣는다
		int min_month = 0; //인덱스를 찾음! 인덱스 = month
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
		
	
			
		System.out.printf("1년동안의 전체 사용금액은 %.1f입니다\n",sum);//%d는 정수 %f는 실수.. 소수점이하 자리 제한.n
		System.out.printf("월별 평균 사용금액은 %.1f입니다\n",avg);//.1은 소숫점 첫째자리까지 .2는 소숫점 둘째자리까지..
		System.out.printf("가장 지출이 많았던 월은 %d입니다\n",max_month+1);
		System.out.printf("가장 지출이 적었던 월은 %d입니다\n",min_month+1);



	}
}
