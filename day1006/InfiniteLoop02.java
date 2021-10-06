class InfiniteLoop02 
{
	public static void main(String[] args) 
	{
		int i=1;
		for(;;){
		 System.out.println("Hello");
		 if(i>=3){
			break;
		 }
		 i++;
		}
//무한루프.. 중지시키려면 콘솔에다가 마우스 놓고 ctrl+c하면 된다!
	}
}
