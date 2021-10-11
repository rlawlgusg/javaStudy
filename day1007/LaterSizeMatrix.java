class LaterSizeMatrix
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int[3][4];
		
		int n = 1;
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ;j<a[0].length ; j++){
				a[i][j] = n++; //a[i][j]는 행열의 위치! 
			}
		}
			
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ;j<a[0].length ; j++){ //a[0].length =>3행의 4열이니까 {{4}{4}{4}}라는뜻..길이가 같음
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		
	}
}
