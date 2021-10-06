import java.util.Scanner;
class Homework
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double height,kg,standard;
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.print("체중을 입력하세요: ");
		kg = sc.nextDouble();

		standard = (height - 100)*0.9; // 정상 +-10% 
		if (kg < standard*0.9)
		{
			System.out.print("저체중 입니다!");
		}else if (kg > standard*1.1)
		{
			System.out.print("과체중 입니다!");
		}else
			System.out.print("표준체중 입니다!");
	}
}
