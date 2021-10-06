import java.util.Scanner;
class LenghthOfVowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a = "";
		int cnt=0;
		char c;

		System.out.print("문자열을 입력하세요: ");
		a = sc.next();
		
		
		
		
		for(int i=0;i<a.length();i++){
			c = a.charAt(i);
			if(c == 'a' || c == 'e'||c == 'i'||c == 'u'||c == 'o'||c == 'A' || c == 'E'||c == 'I'||c == 'U'||c == 'O'){
				cnt++;
			
			}
		}
		System.out.println("모음의 개수는"+cnt);
		System.out.printf("모음의 수는 %d개입니다", cnt); //%d는 숫자! ,뒤에는 숫자에 대응하는 변수를 써준다

		



	}
}
