import java.util.Scanner;
class PlusFor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum = 0;
		/*
		n은 사용자로부터 입력받기 때문에 꼭 초기화 하지 않아도 되지만
		sum은 반복문에서 sum = sum+i의 연산을 해야하기 때문에 반드시 초기값을 주어야 한다!
		지금은 더하기를 할것이라서 0으로 초기화했습니다
		주어진 문제해결을 위하여 그때마다 적합한 값으로 초기화 해야 합니다
		*/
		System.out.print("1부터 어떤 수 까지 더하기 할까요?");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			sum += i;
		} 
		System.out.print("1부터 "+n+"까지의 합은 "+sum+"입니다");

	}
}
