import java.util.Scanner;
class PrimeNumberTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true;
		System.out.print("N을 입력하세요: ");
		n = sc.nextInt();
		
		for(int i=2 ; i<n ; i++){
			if(n % i == 0){
			flag = false; //만약 n의 값이 100이라면 i가 2일 때 조건식을 만족하여 flag에 false가 된다
			break;        //굳이 i를 증가시켜 3,4...일때 판별할 필요가 없다......flag에 false가 담는 순간
			}             //반복문을 탈출하도록하는게 좋겠다!
		}		
				if(flag == true){ 
				System.out.println(n+"은 소수 입니다");
				}else{
				System.out.print(n+"은 소수가 아닙니다");
		}
	}
	}
