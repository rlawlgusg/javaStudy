class Programming14
{
	public static void main(String[] args) 
	{
		//�迭 �Ƚᵵ��..
		int multiple;
		int []a={2,3,4,5,6,7,8,9};
		int []b={1,2,3,4,5,6,7,8,9};

		for(int i =0 ; i<a.length ; i++){
			System.out.println(a[i]+"��");
			for(int j =0 ; j<b.length ; j++){
				multiple = a[i]*b[j];
				System.out.println(a[i]+" * "+b[j]+" = "+multiple);
			}//end for j
			
			System.out.println();
		}//end for i
		
		/*
		�迭 �Ⱦ����� 
		for(int i =2 ; i<=9 ; i++){
			for(int j =1 ; j<=9 ; j++){
				multiple = i*j;
				System.out.println(i+" * "+j+"="+multiple);
			}//end for j
		}//end for i
		*/




	}
}
