import java.util.Scanner;
class ThreeNumber
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("세번째 수를 입력하세요: ");
		c = sc.nextInt();
		if(a>b && a>c)
			{
        System.out.print("가장 큰수는 "+a+"입니다");
		}else if (b>a && b>c)
		{
		System.out.print("가장 큰수는 "+b+"입니다");
		}else
			{
		System.out.print("가장 큰수는 "+c+"입니다");
		}
	}
}

/* 중첩 선택문 - 중첩선택문에서 else가 오면 나와 가장 가까운 if에 대응된다!
if(a>b){
 if(a>c){
  max = a;
 }else{
  max = c;
}
}else{
 if(b>c){
  max = b;
 }else{
  max = c;
 }
}
*/