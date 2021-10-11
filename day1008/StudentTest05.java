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


class StudentTest05
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[5]; //배열 5개 만든거임..
		for(int i=0;i<s.length;i++){
			s[i] = new Student();//객체 생성후 사용가능!!!!!!
			System.out.printf("%d번째 학생의 이름을 입력하시오: ",i+1);
			s[i].name = sc.next();
			System.out.printf("%d번째 학생의 국어점수를 입력하시오",i+1);
			s[i].kor = sc.nextInt();
			System.out.printf("%d번째 학생의 영어점수를 입력하시오",i+1);
			s[i].eng = sc.nextInt();
			System.out.printf("%d번째 학생의 수학점수를 입력하시오",i+1);
			s[i].math = sc.nextInt();
			s[i].tot = s[i].kor+s[i].eng+s[i].math;
			s[i].avg = s[i].tot/3.0;
		
		}
		//성적이 높은 순으로 정렬해봄(내림차순)
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[j].avg>s[i].avg){
					Student temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<s.length;i++){
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",
				s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].tot,s[i].avg);
		}


		
	}
}