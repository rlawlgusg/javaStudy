import java.util.Scanner;
class LenghthOfVowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a = "";
		int cnt=0;
		char c;

		System.out.print("���ڿ��� �Է��ϼ���: ");
		a = sc.next();
		
		
		
		
		for(int i=0;i<a.length();i++){
			c = a.charAt(i);
			if(c == 'a' || c == 'e'||c == 'i'||c == 'u'||c == 'o'||c == 'A' || c == 'E'||c == 'I'||c == 'U'||c == 'O'){
				cnt++;
			
			}
		}
		System.out.println("������ ������"+cnt);
		System.out.printf("������ ���� %d���Դϴ�", cnt); //%d�� ����! ,�ڿ��� ���ڿ� �����ϴ� ������ ���ش�

		



	}
}
