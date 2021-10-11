class MyUtil{
	static boolean equalArray(int []a,int []b){ 
			boolean flag = true; 

	     if(a.length != b.length){
				return flag; //더이상 작업진행 x, 호출한 곳으로 그냥 되돌아간다! 
			for(int i=0 ; i<a.length ; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}	
		} 
	}  
}//메소드는 클래스영역에만 정의 가능! 



class TeamMethod{
	public static void main(String[] args){
		
		int []a = {10,20,30,40,50};
		int []b = {60,70,80,90,100};

		MyUtil.equalArray(a,b); 
	
		if(flag){
			System.out.println("배열의 내용이 일치합니다");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다");
		}
		
		
	}
}
