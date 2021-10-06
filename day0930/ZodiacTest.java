import java.util.Scanner;
 class ZodiacTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		String zodiac="";
		int month , day;

		System.out.print("이름을 입력하세요: ");
		name = input.next();
		System.out.print("생월을 입력하세요: ");
		month = input.nextInt();
		System.out.print("생일을 입력하세요: ");
		day = input.nextInt();

		if(month<1 || month>12){
			System.out.println("잘못된 입력값입니다.");
			return;
		  }if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다.");
			return;
		  }else {
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
			           else  zodiac = "전갈자리";break;f
			    case 12:if(day>=25) zodiac = "염소자리";
			           else  zodiac = "사수자리";break;
			}
	}
           System.out.println(name+"님의 별자리는 "+zodiac+"입니다");
	}
}
