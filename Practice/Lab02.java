import java.io.IOException;//io 입출력 IOExeption 예외처리
class Lab02 
{
	public static void main(String[] args) throws IOException{ //시스템 니가 알아서 예외처리해
		String s;
		System.out.println("문자를 입력하시오.: ");
		char c = (char)System.in.read();//입력받는기능 read 정수값으로 읽은후 변환

		switch(c)//문자나 정수 문자열도 올수있다 보통은 정수쓰는게 일반적
		{
			case 'a': case 'e': case 'i': case'u': case'o':
			case 'A' : case 'E' : case 'I' : case 'U' : case 'O':
				System.out.printf("입력된 문자 %c는 모음입니다", c); break;
			default : 
				System.out.print("입력된 문자는 모음이 아닙니다");break;
		}
	
	/*
	if(c =='a'|| c =='e' || c == 'i' || c=='u' || c =='o'){
		System.out.print("입력된 문자는 %c는 모음입니다", c );
	}else
		System.out.print("입력된 문자는 %c는 모음이 아닙니다", c );
	
	*/
	
	
	}
}
