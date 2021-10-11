/*
이 프로그램은 5명의 이름,국어,영어,수학을 입력받아 총점과 평균을 구한다음 성적순으로 정렬하여 출력하는 프로그램임
성적순으로 정렬할 때에 순서가 맞지 않으면 이름도 바꿔주고 국어, 영어, 수학, 총점, 평균을 일일이 모두 바꿔줘야 하는것은 
번거로움 
만약에 한명의 학생의 대한 성적 정보가 20개 이상이 넘는다면 일일이 바꿔주는 것은 상상하기 조차 싫음

이럴때에 한명의 학생의 정보를 관리하기에 필요한 이름, 국어, 영어, 수학, 총점, 평균을 하나의 세트로 만들 수 있는데
이것을 "클래스"를 만든다 라고 함
이렇게 클래스를 만들어 두면 한명의 정보가 따로 따로 있는 것이 아니라 하나의 세트로 표현할 수 있음 
정렬할때에 일처리 하는것이 수월함

*/
import java.util.Scanner;

class Student{
	//하나의 묶음을 만든다
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}


class StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student(); //Student s=세트를 만들기 위한 변수.. (객체)	
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 80;
		s.math = 90;

		s.tot = s.kor+s.eng+s.math;
		s.avg = s.tot/3.0;
		
		System.out.println("이름:"+s.name);
		System.out.println("국어:"+s.kor);
		System.out.println("영어:"+s.eng);
		System.out.println("수학:"+s.math);
		System.out.println("총점:"+s.tot);
		System.out.println("평균:"+s.avg);
	}
}