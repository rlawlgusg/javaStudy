import java.util.Scanner;
class Homework01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a; //char op; char도 가능!
		double b , c;
	    double plus,min,multi,divid;

		System.out.println("하나의 연산자를 입력하시오");
		a = sc.next(); // op = sc.next().charAt(0) <<char의 첫번째 변수에 넣어라
		System.out.println("첫번째 숫자를 입력하시오");
		b = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		c = sc.nextInt();
	
	//문자열 비교는 (문자열변수).equals(비교하려는 문자열), char을 사용할 경우 op == '+'
		if(a.equals("+")){ 
			plus = b+c;
			System.out.println(b+" + "+c+" = "+plus);
		}else if (a.equals("-")){
			min = b-c;
			System.out.println(b+" - "+c+" = "+min);
		}else if(a.equals("*")){
			multi = b*c;
			System.out.println(b+" * "+c+" = "+multi);
		}else if (a.equals("/")){
			if(c == 0){
				System.out.println("분모가 0이기 때문에 계산할 수 없습니다");
			}else{
				divid = b/c;
				System.out.println(b+" / "+c+" = "+divid);
			}			
		}else{
			System.out.println("잘못된 연산자 입니다");
		}

	}
}
