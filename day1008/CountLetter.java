import java.util.Scanner;
class CountLetter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []count =new int[26];

		System.out.println("문자열을 입력하시오: "); //next 빈칸, 공백 문자를 못받음..
		//String buffer =sc.next();
		String buffer = sc.nextLine(); //nextLine= 공백문자도 입력받을 수 있음
		System.out.println(buffer);
		//각 문자가 등장하는 횟수를 계산한다 (단, 빈칸은 제외)
		for(int i=0;i<buffer.length();i++){
			char ch = buffer.charAt(i);
			if(ch != ' '){
				if(ch >= 'A' && ch<='Z'){
					//ch = ch + 32; 
					//incompatible types: possible lossy conversion from int to char
					//ch는 정수이기때문에 char로 형변환 해줘야함
					ch = (char)(ch +32);
				}
				count[ch-'a']++;
			}
		}
		//배열에 저장된 횟수를 출력하는 반복문
		for(int i=0;i<count.length;i++){
			System.out.printf("%10c %5d\n",(char)('a'+i),count[i]); //%c는 문자출력
		}
		//'a' :97
		//'A' : 65
		//'a'-'A' :32
		//대문자를 소문자로 바꾸려면 (char)(ch+32)
		

	}
}
