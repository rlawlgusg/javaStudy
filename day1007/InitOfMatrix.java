class InitOfMatrix 
{
	public static void main(String[] args) 
	{
		int [][]a = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
		//2차원 배열에 대한 초기화! 선언함과 동시에 초기화 될 수 있당

		for(int i = 0; i<3 ; i++){
			for(int j = 0 ; j<5; j++){
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		
	}
}
