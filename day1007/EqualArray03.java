class EqualArray03
{
	public static void main(String[] args) 
	{
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		//Index 5 out of bounds for length 5

		int [] b = {1,2,3,4,5};

		if(a.length != b.length){
			System.out.println("배열의 내용이 일치하지 않습니다.");
			return; // 메인 메소드를 멈춰라!
		}
		//이 뒤에 실행되는 경우 a.length와 b.length가 같을경우에만
	
		boolean flag = true; 
		//boolean을 사용하여 배열 중간에 틀린것이 있다면 바로 for문에서 탈출
		
		for(int i=0;i<a.length;i++){
			if(a[i] != b[i]){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("배열의 내용이 일치합니다");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다");
		}

			

		

		
		
	}
}
