import java.util.Scanner;
class Month
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		String name = "";
		int m ;
		/*에러가 나는 이유 
		자바가 판단하기에 사용자의 입력값에 따라 if조건식을 하나도 만족하지 않으면 
		name의 값이 초기화 되지 않을 수 있어요 
		name의 값이 초기화 되지 않는 상태에서 출력을 할 수 없다는 오류입니다
		그래서 보통은 문자열 변수를 만들때에는 초기값 ""을 줍니다!*/

		System.out.print("몇월인지 입력하세요: ");
		m = sc.nextInt();
		
		if(m >= 3 && m <= 5){
			name = "봄";
		}else if(m >= 6 && m <= 8){
			name = "여름";
		}else if(m >= 9 && m <= 11){
			name = "가을";
		}else if(m == 1 || m == 2 || m ==12 ){
            name = "겨을";
		}
            System.out.println(m+"월은 "+name+"입니다");
	}
}

