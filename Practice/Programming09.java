import java.util.Scanner;
class Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x, result; //실수형이니까 double!

		System.out.println("계산할 x값을 입력하시오");
		x = sc.nextDouble();

		if(x <= 0){
			result = x*x*x-9*x+2;
		}else 
			result = 7*x+2;
		//if문 바깥으로 출력 if문 안에 있으면 참이든 거짓이든 둘다 출력됌
		System.out.println("답은 "+result+" 입니다");


	}
}
