import java.util.Scanner;
class TeamTestZodiac
{
	public static void main(String[] args) 
	{
	String name, zodiac="";//switch문은 변수선언!
	String answer;
	int month,day;
	int last = 31;
	Scanner sc = new Scanner(System.in);
	
	while(true){
		System.out.print("이름을 입력하세요: ");
		name = sc.next();

		for(;;){
			System.out.print("생월을 입력하세요: ");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				if(month == 2){
					last = 28;
				}else if(month ==4 || month==6 || month == 9 || month ==11){
					last = 30;
				}
			}
				break;
			}//생월 for끝 맞으면 for문 탈출
		
		while(true){
		System.out.print("생일을 입력하세요: ");
		day = sc.nextInt();
		if(day>=1 && day <= last){
			break;
			}
		}

		switch(month){
				case 1:if(day>=20) zodiac = "염소자리";
			           else  zodiac = "물병자리";break;
			    case 2:if(day>=19) zodiac = "물고기자리";
			           else  zodiac = "염소자리";break;
		        case 3:if(day>=20) zodiac = "양자리";
			           else  zodiac = "물고기자리";break;
			    case 4:if(day>=20) zodiac = "황소자리";
			           else  zodiac = "양자리";break;
			    case 5:if(day>=21) zodiac = "쌍둥이자리";
			           else  zodiac = "황소자리";break;
			    case 6:if(day>=22) zodiac = "게자리";
			           else  zodiac = "쌍둥이자리";break;
			    case 7:if(day>=23) zodiac = "사자자리";
		               else  zodiac = "게자리";break;
			    case 8:if(day>=23) zodiac = "처녀자리";
		               else  zodiac = "사자자리";break;
		        case 9:if(day>=24) zodiac = "천칭자리";
		               else  zodiac = "처녀자리";break;
			    case 10:if(day>=23) zodiac = "전갈자리";
			           else  zodiac = "천칭자리";break;
			    case 11:if(day>=23) zodiac = "사수자리";
			           else  zodiac = "전갈자리";break;
			    case 12:if(day>=25) zodiac = "염소자리";
			           else  zodiac = "사수자리";break;
				}
			System.out.println(name+"님의 별자리는"+zodiac+"입니다");
		
			for(;;){
			System.out.print("또 하시겠어요?(y/n)");
			answer = sc.next();
			if(answer.equals("y")||answer.equals("n")answer.equals("Y")||answer.equals("N")){
				break;
				}
			}

			if(answer.equals("n")||answer.equals("N")){
				break;
			}
			
		}
			System.out.println("프로그램을 종료합니다.");

	}
}
	
	
	
	
	

	
