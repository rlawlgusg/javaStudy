class MyUtil{
	static boolean equalArray(int []a,int []b){ 
			boolean flag = true; 

	     if(a.length != b.length){
				return flag; //���̻� �۾����� x, ȣ���� ������ �׳� �ǵ��ư���! 
			for(int i=0 ; i<a.length ; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}	
		} 
	}  
}//�޼ҵ�� Ŭ������������ ���� ����! 



class TeamMethod{
	public static void main(String[] args){
		
		int []a = {10,20,30,40,50};
		int []b = {60,70,80,90,100};

		MyUtil.equalArray(a,b); 
	
		if(flag){
			System.out.println("�迭�� ������ ��ġ�մϴ�");
		}else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�");
		}
		
		
	}
}
