import java.util.Scanner;
class SeasonCase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String season = "";
		int month;
	    
		System.out.print("���� �Է��ϼ���: ");
		month = sc.nextInt();
		
		if(month<1 || month>12){
			System.out.println("�߸��� �Է°� �Դϴ�.");  
		}else{
			switch(month){
			case 3: case 4: case 5: season = "��";break;
			case 6: case 7: case 8: season = "����";break;
			case 9: case 10: case 11: season = "����";break;
			case 12: case 1: case 2: season = "�ܿ�";break;
		    }
        System.out.println(month+"���� "+season+"�Դϴ�");  
		}
	}
	}