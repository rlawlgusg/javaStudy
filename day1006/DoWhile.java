class DoWhile 
{
	public static void main(String[] args) 
	{
		

		int i =2;
		do{
			System.out.printf("***%d´Ü***\n",i);
			int j = 1;
			do{
				System.out.printf("%d*%d=%d\n",i,j,i*j);
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}while(i<=9);


	}
}
