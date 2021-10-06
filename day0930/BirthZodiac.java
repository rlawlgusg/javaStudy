import java.util.Scanner;
class BirthZodiac
{
	public static void main(String[] args) 
	{
		String name;
		int month,day;
		String result = "";
		System.out.print("이름을 입력하세요: ");
		name = next();
		System.out.print("생월을 입력하세요: ");
		month = nextInt();
		System.out.print("생일을 입력하세요: ");
		day = nextInt();
		
		if(month<1 || month>12)
			{
		  System.out.print("입력범위를 넘었습니다");
		}else{
			switch(month){
			 case 2:result = 18;
			 case 4:result = 19;
			 case 1:result = 19;break;
             case 3:result = 20;
			 case 5:result = 20;break;
			 case 6:result = 21;break;
             case 7:result = 22;
			 case 8:result = 22;
			 case 10:result = 22;
             case 11:result = 22;break;
			 case 9:result = 23;break;
			 case 12:result = 24;break;
		    }switch(month){
            case 1:if(data>=20) result = "염소자리";
			       else  result = "물병자리";
			case 2:if(data>=19) result = "물고기자리";
			       else  result = "염소자리";
		    case 3:if(data>=20) result = "양자리";
			       else  result = "물고기자리";
			case 4:if(data>=20) result = "황소자리";
			       else  result = "양자리";
			case 5:if(data>=21) result = "쌍둥이자리";
			       else  result = "황소자리";
			case 6:if(data>=22) result = "게자리";
			       else  result = "쌍둥이자리";
			case 7:if(data>=23) result = "사자자리";
		           else  result = "게자리";
			case 8:if(data>=23) result = "처녀자리";
		           else  result = "사자자리";
		    case 9:if(data>=24) result = "천칭자리";
		           else  result = "처녀자리";
			case 10:if(data>=23) result = "전갈자리";
			       else  result = "천칭자리";
			case 11:if(data>=23) result = "사수자리";
			       else  result = "전갈자리";
			case 12:if(data>=25) result = "염소자리";
			       else  result = "사수자리";
		     }
		System.out.println(name+"님의 별자리는 "+result+"입니다");
		}
	}
}

	
