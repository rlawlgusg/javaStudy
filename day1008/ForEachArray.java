class ForEachArray 
{
	public static void main(String[] args) 
	{
		int []data = {1,2,3,4,5};
		
		for(int i:data){
		//	System.out.println(i); //for-each반복문에서 i는 배열의 요소를 하나씩 꺼내옴 
			System.out.println(data[i]);//i자체가 배열의 값을 갖고 오는데 그것을 인덱스로 쓰고 있음..
		}
		
		/*
		for(int i = 0 ;i< data.length ; i++){
			System.out.println(data[i]);
		}
		*/
		
	}
}
