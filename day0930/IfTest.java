import java.util.Scanner;
class IfTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,a,b;
		System.out.print("임의의 수 N을 입력하세요: ");
		n = sc.nextInt();
		if(n>=0){
			//n = n+100;
	    System.out.println(n+100);
		}else{
			//n = n*n;
		System.out.println(n*n);
		}
		System.out.println("작업종료");
	}
}
