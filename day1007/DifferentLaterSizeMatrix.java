class DifferentLaterSizeMatrix
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int[3][];//���� ũ�⸸ 3���� �ϰ� ���� ũ��� ���� ����������!
		a[0] = new int[2];
		a[1] = new int[5];
		a[2] = new int[3];//{{1,2},{3.4.5.6.7},{8,9,10}}





		int n = 1;
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ;j<a[i].length ; j++){
				a[i][j] = n++; //a[i][j]�� �࿭�� ��ġ! 
			}
		}
			
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ;j<a[i].length ; j++){ //a[0].length =>3���� 4���̴ϱ� {{4}{4}{4}}��¶�..���̰� ����
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		
	}
}
