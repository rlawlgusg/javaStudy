import java.util.Scanner;
class LenghthOfVowel_Switch
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
			switch(c){
				case 'a':case 'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
				cnt ++;
			}
		}
		System.out.println("������ ������"+cnt);
		System.out.printf("������ ���� %d���Դϴ�", cnt); //%d�� ����! ,�ڿ��� ���ڿ� �����ϴ� ������ ���ش�

		



	}
}
