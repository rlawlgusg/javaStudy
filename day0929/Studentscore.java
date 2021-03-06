/*
논리연산자
&& 논리곱 두개의 조건식을 모두 만족하는 지 판별하고자 할때 사용
|| 논리합 두개의 조건식중에 하나라도 만족하는지 판별하고자 할때 사용 
논리연산자도 비교연산자와 마찬가지로 선택문의 조건식에 주로 사용합니다
만약 판별해야하는 조건식이 2개 이상일때에는 논리곱(&&),논리합(||)을 사용합니다
두개의 조건식이 모두 만족하는지 판별해야 하는 경우에는 논리곱(&&)연산자를 사용하고
두개의 조건식 중에 하나라도 만족하는지 판별해야 하는 경우라면 논리합(||)연산자를 사용합니다
if(조건식1 && 조건식2) 둘다 만족
if(조건식1 || 조건식2) 둘 중 하나 만족
*/
import java.util.Scanner;
class Studentscore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, tot;
		double avg;
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("국어점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요: ");
	    math = sc.nextInt();
		tot = kor+eng+math;
		avg = (double)tot / 3;
        System.out.println(name+" 학생의 평균점수는 "+avg+"입니다");
		if(kor>=90 && avg>=90)
		System.out.println(name+" 학생은 장학금 지급대상 입니다");
		else
		System.out.println(name+" 학생은 장학금 지급대상이 아닙니다");
	}
}
