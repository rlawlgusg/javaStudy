import java.util.Scanner;
class Onumber{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
	    System.out.println("문자열을 입력하세요");
		data = sc.next(); 
		int number = 0;
		char ch;
		for(int i=0 ; i < data.length() ;i=i+1 ){
			ch = data.charAt(i);
			if( ch == 'o')
			number =number +1;
		}
		System.out.println("소문자 o의 수는"+number+"입니다");
}
}