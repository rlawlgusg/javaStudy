class PrintWhile 
{
	public static void main(String[] args) 
	{ //while�� ��ø
		int i =2;
		while(i<=9){
			System.out.printf("*** %d�� ***\n",i);
			int j =1;
			while(j<=9){
				System.out.printf("%d*%d=%d\n",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
	
			
		}
	}
}
