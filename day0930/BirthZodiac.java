import java.util.Scanner;
class BirthZodiac
{
	public static void main(String[] args) 
	{
		String name;
		int month,day;
		String result = "";
		System.out.print("�̸��� �Է��ϼ���: ");
		name = next();
		System.out.print("������ �Է��ϼ���: ");
		month = nextInt();
		System.out.print("������ �Է��ϼ���: ");
		day = nextInt();
		
		if(month<1 || month>12)
			{
		  System.out.print("�Է¹����� �Ѿ����ϴ�");
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
            case 1:if(data>=20) result = "�����ڸ�";
			       else  result = "�����ڸ�";
			case 2:if(data>=19) result = "������ڸ�";
			       else  result = "�����ڸ�";
		    case 3:if(data>=20) result = "���ڸ�";
			       else  result = "������ڸ�";
			case 4:if(data>=20) result = "Ȳ���ڸ�";
			       else  result = "���ڸ�";
			case 5:if(data>=21) result = "�ֵ����ڸ�";
			       else  result = "Ȳ���ڸ�";
			case 6:if(data>=22) result = "���ڸ�";
			       else  result = "�ֵ����ڸ�";
			case 7:if(data>=23) result = "�����ڸ�";
		           else  result = "���ڸ�";
			case 8:if(data>=23) result = "ó���ڸ�";
		           else  result = "�����ڸ�";
		    case 9:if(data>=24) result = "õĪ�ڸ�";
		           else  result = "ó���ڸ�";
			case 10:if(data>=23) result = "�����ڸ�";
			       else  result = "õĪ�ڸ�";
			case 11:if(data>=23) result = "����ڸ�";
			       else  result = "�����ڸ�";
			case 12:if(data>=25) result = "�����ڸ�";
			       else  result = "����ڸ�";
		     }
		System.out.println(name+"���� ���ڸ��� "+result+"�Դϴ�");
		}
	}
}

	
