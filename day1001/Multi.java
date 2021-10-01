import java.util.Scanner;
class Multi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("구구단중에 몇단을 출력할까요?");
	    n = sc.nextInt();
		for(int i = 1 ;i<=9 ;i = i+1){
			System.out.println(n +"*" +i +"=" + (n*i));
		}
	}
}
