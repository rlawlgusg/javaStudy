class LoopArray 
{
	public static void main(String[] args) 
	{
		int[]lotto = {4,11,19,26,27,43};
		System.out.println("이번주 로또번호");

        for(int i = 0; i<lotto.length ; i++){ 
		//for(int i = 0; i<=5; i++){ 
		//배열의 길이를 알려주는 속성 : lotto.length (!= length.c)
			System.out.print(lotto[i]+ " ");
		}
		/*
		System.out.print(lotto[0]+ " ");
		System.out.print(lotto[1]+ " ");
		System.out.print(lotto[2]+ " ");
		System.out.print(lotto[3]+ " ");
		System.out.print(lotto[4]+ " ");
		System.out.print(lotto[5]+ " ");
		*/


	}
}
