import java.util.Scanner;
class PrimeNumberTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true;
		System.out.print("N을 입력하세요: ");
		n = sc.nextInt();
		
		for(int i=2 ; i<n ; i++){
			if(n % 1 == 0){
			flag = false;
			}
		}		
				if(flag == true){ // = if(flag)
				System.out.println(n+"은 소수 입니다");
				}else{
				System.out.print(n+"은 소수가 아닙니다");
		}
	}
	}
