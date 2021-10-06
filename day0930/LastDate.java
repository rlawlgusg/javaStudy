import java.util.Scanner;
class LastDate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String last = "";
		int m;
		System.out.print("월을 입력하세요: ");
		m= sc.nextInt();

		if(m<1 || m>12){
			 System.out.print("잘못된 입력입니다");
			}else{
				if(m == 2){
					last = "28일";
			    }else if (m == 4 ||m == 6|| m == 9 || m ==11 ){
					last = "30일";
				}else {
					last = "31일";
				} System.out.print(m+"월은 "+last+"까지 있어요!");
        }
				
			}
	}
