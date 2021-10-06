import java.util.Scanner;
class WhileCorrectValueInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		
		/*
		int month = -1;
		while(month<1 ||month>12){
			System.out.print("월을 입력하세요: ");
			month = sc.nextInt();
		}
		*/


		/*
		for(;;){
			System.out.print("월을 입력하세요: ");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}*/
		/*
		while (true)//계속 참이다..
		{
			System.out.print("월을 입력하세요: ");
			month = sc.nextInt();
			if(month>=1 && month<=12){//이조건에 맞으면 while문을 탈출하세요!
 			break;
			}
		}
		*/

		do{
			System.out.print("월을 입력하세요: ");
			month = sc.nextInt();
		}while(month<1||month>12);//입력값이 제대로 된값이 아니면 계속 실행..



		
		String name = "";
		if(month >=3 && month <=5){
			name = "봄";
		}else if(month >=6 && month <=9){
			name = "여름";
		}else if(month >=9 && month <=11){
			name = "가을";
		}else{
			name = "겨울";
		}

		System.out.printf("%d월은 %s입니다",month,name);

	}
}
