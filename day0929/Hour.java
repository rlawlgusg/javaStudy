import java.util.Scanner;
class Hour
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h, d1, d2, d3;
		System.out.println("시간을 초단위로 입력하세요");
		h = sc.nextInt();

		d1 = h / 3600;
		d2 = (h % 3600) / 60;
		d3 = (h % 3600) % 60;
		System.out.println("시간은 "+d1+"시"+d2+"분"+d3+"초 입니다");

	}
}
