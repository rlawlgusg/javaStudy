import java.util.Scanner;
class TeamTestZodiac
{
	public static void main(String[] args) 
	{
	String name, zodiac="";//switch���� ��������!
	String answer;
	int month,day;
	int last = 31;
	Scanner sc = new Scanner(System.in);
	
	while(true){
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();

		for(;;){
			System.out.print("������ �Է��ϼ���: ");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				if(month == 2){
					last = 28;
				}else if(month ==4 || month==6 || month == 9 || month ==11){
					last = 30;
				}
			}
				break;
			}//���� for�� ������ for�� Ż��
		
		while(true){
		System.out.print("������ �Է��ϼ���: ");
		day = sc.nextInt();
		if(day>=1 && day <= last){
			break;
			}
		}

		switch(month){
				case 1:if(day>=20) zodiac = "�����ڸ�";
			           else  zodiac = "�����ڸ�";break;
			    case 2:if(day>=19) zodiac = "������ڸ�";
			           else  zodiac = "�����ڸ�";break;
		        case 3:if(day>=20) zodiac = "���ڸ�";
			           else  zodiac = "������ڸ�";break;
			    case 4:if(day>=20) zodiac = "Ȳ���ڸ�";
			           else  zodiac = "���ڸ�";break;
			    case 5:if(day>=21) zodiac = "�ֵ����ڸ�";
			           else  zodiac = "Ȳ���ڸ�";break;
			    case 6:if(day>=22) zodiac = "���ڸ�";
			           else  zodiac = "�ֵ����ڸ�";break;
			    case 7:if(day>=23) zodiac = "�����ڸ�";
		               else  zodiac = "���ڸ�";break;
			    case 8:if(day>=23) zodiac = "ó���ڸ�";
		               else  zodiac = "�����ڸ�";break;
		        case 9:if(day>=24) zodiac = "õĪ�ڸ�";
		               else  zodiac = "ó���ڸ�";break;
			    case 10:if(day>=23) zodiac = "�����ڸ�";
			           else  zodiac = "õĪ�ڸ�";break;
			    case 11:if(day>=23) zodiac = "����ڸ�";
			           else  zodiac = "�����ڸ�";break;
			    case 12:if(day>=25) zodiac = "�����ڸ�";
			           else  zodiac = "����ڸ�";break;
				}
			System.out.println(name+"���� ���ڸ���"+zodiac+"�Դϴ�");
		
			for(;;){
			System.out.print("�� �Ͻðھ��?(y/n)");
			answer = sc.next();
			if(answer.equals("y")||answer.equals("n")answer.equals("Y")||answer.equals("N")){
				break;
				}
			}

			if(answer.equals("n")||answer.equals("N")){
				break;
			}
			
		}
			System.out.println("���α׷��� �����մϴ�.");

	}
}
	
	
	
	
	

	
