import java.util.Scanner;
class Homework03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt;
		int cost = 100;
		double price; 

		System.out.println("������ ������ ������ �Է��Ͻÿ�");
		cnt = sc.nextInt();

		if (cnt<1){
			System.out.println("�߸��� �Է°� �Դϴ�");
		}else{
				if (cnt >= 10){
					price = cost * cnt * 0.9;
				}else{
					price = cost * cnt;
				}
			System.out.println("������ ������ ������ "+price+"�Դϴ�");
		}

	}
}