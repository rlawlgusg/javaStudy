import java.util.Scanner;
class ScoreArrayTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[10] ;
		
		for(int i=0; i <score.length; i++){
			System.out.println(i+1+"번째 점수를 입력하시오");
			score[i] = sc.nextInt();
		}
		int max = score[0];
		int min = score[0];

		/*배열중에 max값이랑 min찾을때 if는 따로 필요하다! 가장 큰값이 아니라고 작다는건 아님..
		큰값을 찾기 위한 if문과 작은 값을 찾기위한 if문을 따로 써야한다!
		{5,2,3,6,1} 만약 배열의 원소가 위와 같을 때 max = 5 min = 2가 담겨있고
		i가 2라 할때에 배열의 i번째 원소의 값 3이 max의 값 5보다 크지않다고 min에 넣을 수는 없다 
		현재 min에는 i번째 원소의 값 3보다 더 작은 값이 있다
		따라서 큰 값을 찾는 if와 else로 처리하여 작은값에 넣을 수 없다 
		*/
		for(int i=1;i<score.length;i++){
			if(max < score[i]){
				max = score[i];
		    }
			if(min > score[i]){
				min = score[i]
			}
		}
		System.out.println("가장 큰 점수는"+max+"입니다");
		System.out.println("가장 작은 점수는"+min+"입니다");







	}
}
