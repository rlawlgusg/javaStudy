import java.util.Scanner;
class Examscore 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor , eng, math;
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		int tot = kor + eng + math;
		double avg = tot/3.0;
		//혹은 avg = tot/3.0; , 혹은 avg = tot/(double)3;
		if(avg >= 60)
		System.out.println("합격");
		else
		System.out.println("불합격");
	
	}
}
