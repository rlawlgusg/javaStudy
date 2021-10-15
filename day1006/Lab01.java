import java.util.Scanner;
class Lab01 
{
	public static void main(String[] args) 
	{
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		/*
		printf에서 f는 포맷! 변수의 내용을 형식을 지정해서 출력하고자 할때
		형식 지정문자 %s,data >>data를 S(문자열) 형식에 맞춰서 써주세요..라는뜻
		%s = string , %f , %d
		칸을 지정.. 10칸을 잡으려면 %10s
		*/
		score = input.nextInt();

		/*if(score >= 60){
			System.out.println("합격!");
			System.out.println("축하합니다.");
		}else
			System.out.println("불합격!");
		System.out,println("종료");	*/
		//해야할 명령이 하나면 중괄호 생략 가능! 들여쓰기 내어쓰기 잘 표현해야한다
	
	
	/* 삼항연산자 ? 사용 (조건식)?:참:거짓;
	예시1
	String result = (score >= 60)? "합격!": "불합격!";
	System.out.println(result); 
	예시2
	System.out.println((score >= 60)? "합격!": "불합격!"); */
	*/


		if(score>=80){
			System.out.println("아주 우수하게 합격하였습니다.");
		}else{//80미만..
			if(score>=70){
				System.out.println("우수하게 합격하였습니다");
			}else//70미만{
				if (score>=60){
					System.out.println("합격입니다");
				}else{//60미만
					if (score>=50){
						System.out.println("안타깝게 불합격!");
					}else{
						System.out.println("불합격!");
					}

				}
			}
		
		/*

		if(score<50){
			System.out.println("불합격 입니다");
		}else if(score<60){
			System.out.println("안타깝게 불합격입니다");
		}else if(score<70){
			System.out.println("합격 입니다");
		}else if(score<80){
		System.out.println("우수하게 합격하였습니다");
		}else{
		System.out.println("아주 우수하게 합격하였습니다"); 
		}

		*/






	}
}
