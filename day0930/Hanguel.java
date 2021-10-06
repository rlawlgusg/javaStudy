import java.util.Scanner;
class Hanguel
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("0에서 9사이의 정수를 입력하세요: ");
	    n = input.nextInt();
		if(n == 0){
		 System.out.println("영");
		}else if (n == 1)
			{
         System.out.println("일");
		}else if (n == 2)
			{
         System.out.println("이");
		}else if (n == 3)
			{
         System.out.println("삼");
		}else if (n == 4)
			{
         System.out.println("사");
		}else if (n == 5)
			{
         System.out.println("오");
		}else if (n == 6)
			{
         System.out.println("육");
		}else if (n == 7)
			{
         System.out.println("칠");
		}else if (n == 8)
			{
         System.out.println("팔");
		}else{
         System.out.println("구");
		}
}
}