class LengthOfArray
{
	public static void main(String[] args) 
	{

		int [][]a = {{1,2},{3,4,5,6,7},{8,9,10}};

		for(int i=0 ; i<a.length ; i++){
			for(int j=0 ; j<a[i].length ; j++){
				System.out.printf("%5d",a[i][j]); //%5d는 5칸을 만든다는 뜻..
			}
			System.out.println();
		}

		
	}
}
