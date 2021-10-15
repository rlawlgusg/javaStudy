import java.util.Scanner;
class Homework03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt;
		int cost = 100;
		double price; 

		System.out.println("구입한 물건의 개수를 입력하시오");
		cnt = sc.nextInt();

		if (cnt<1){
			System.out.println("잘못된 입력값 입니다");
		}else{
				if (cnt >= 10){
					price = cost * cnt * 0.9;
				}else{
					price = cost * cnt;
				}
			System.out.println("구입한 물건의 가격은 "+price+"입니다");
		}

	}
}