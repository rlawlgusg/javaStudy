class DifferentLaterSizeMatrix
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int[3][];//행의 크기만 3개로 하고 열의 크기는 아직 안정해졌어!
		a[0] = new int[2];
		a[1] = new int[5];
		a[2] = new int[3];//{{1,2},{3.4.5.6.7},{8,9,10}}





		int n = 1;
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ;j<a[i].length ; j++){
				a[i][j] = n++; //a[i][j]는 행열의 위치! 
			}
		}
			
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ;j<a[i].length ; j++){ //a[0].length =>3행의 4열이니까 {{4}{4}{4}}라는뜻..길이가 같음
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		
	}
}
