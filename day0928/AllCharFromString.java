class AllCharFromString 
{
	public static void main(String[] args) 
	{
		String data = "java";
        char ch; 
		int cnt = 0;

		for(int i=0 ; i < data.length() ;i=i+1 ){
			ch = data.charAt(i);
		    //System.out.println(ch);
			if(ch == 'a')
			cnt =cnt +1;
		}
         System.out.println("소문자 a의 개수는"+cnt+"개 입니다");

		/*ch = data.charAt(0);
		System.out.println(ch);
		ch = data.charAt(1);
		System.out.println(ch);
		ch = data.charAt(2);
		System.out.println(ch);
		ch = data.charAt(3);
		System.out.println(ch);
		ch = data.charAt(4);
		System.out.println(ch);*/


	}
}
