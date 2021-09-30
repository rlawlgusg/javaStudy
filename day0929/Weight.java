import java.util.Scanner;
class Weight
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double p;
		System.out.println("몸무게를 작성하시오: ");
		p = sc.nextDouble();
		double weight = p * 454;
		System.out.println("그램으로 환산한 몸무게는: "+weight+"입니다");
		
	}
}
