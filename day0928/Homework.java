import java.util.Scanner;
class Homework{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("10000보다 작은 정수를 입력하라:");
	    n = sc.nextInt();
		int a = n/1000;//몫 5 나머지 623
		int b = (n%1000)/100;//몫 6 나머지 23
		int c = ((n%1000)%100)/10;//몫2 나머지 3
		int d = (((n%1000)%100)/10)%10;

		System.out.println("천의자리는:" +a+"입니다");
		System.out.println("백의자리는:" +b+"입니다");
		System.out.println("십의자리는:" +c+"입니다");
		System.out.println("일의자리는:" +d+"입니다");
	}
}