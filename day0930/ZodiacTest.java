import java.util.Scanner;
 class ZodiacTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		String zodiac="";
		int month , day;

		System.out.print("�̸��� �Է��ϼ���: ");
		name = input.next();
		System.out.print("������ �Է��ϼ���: ");
		month = input.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		day = input.nextInt();

		if(month<1 || month>12){
			System.out.println("�߸��� �Է°��Դϴ�.");
			return;
		  }if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�.");
			return;
		  }else {
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
			           else  zodiac = "�����ڸ�";break;f
			    case 12:if(day>=25) zodiac = "�����ڸ�";
			           else  zodiac = "����ڸ�";break;
			}
	}
           System.out.println(name+"���� ���ڸ��� "+zodiac+"�Դϴ�");
	}
}
