import java.util.Scanner;
class ScoreArrayTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[10] ;
		
		for(int i=0; i <score.length; i++){
			System.out.println(i+1+"��° ������ �Է��Ͻÿ�");
			score[i] = sc.nextInt();
		}
		int max = score[0];
		int min = score[0];

		/*�迭�߿� max���̶� minã���� if�� ���� �ʿ��ϴ�! ���� ū���� �ƴ϶�� �۴ٴ°� �ƴ�..
		ū���� ã�� ���� if���� ���� ���� ã������ if���� ���� ����Ѵ�!
		{5,2,3,6,1} ���� �迭�� ���Ұ� ���� ���� �� max = 5 min = 2�� ����ְ�
		i�� 2�� �Ҷ��� �迭�� i��° ������ �� 3�� max�� �� 5���� ũ���ʴٰ� min�� ���� ���� ���� 
		���� min���� i��° ������ �� 3���� �� ���� ���� �ִ�
		���� ū ���� ã�� if�� else�� ó���Ͽ� �������� ���� �� ���� 
		*/
		for(int i=1;i<score.length;i++){
			if(max < score[i]){
				max = score[i];
		    }
			if(min > score[i]){
				min = score[i]
			}
		}
		System.out.println("���� ū ������"+max+"�Դϴ�");
		System.out.println("���� ���� ������"+min+"�Դϴ�");







	}
}
