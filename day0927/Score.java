//숙제))
//어떤 학생이 이번 학기에 컴퓨터 개론 C언어 프로그래밍 영어 일반 수학을 수강
//신청하였다고 하자, 각 과목의 점수를 입력하면 그 학생의 이번 학기 평균 점수를
//계산하는 프로그램을 작성하라
//1.컴퓨터 개론 과목의 점수를 입력하시오 :80
//2.C언어 프로그래밍 과목의 점수를 입력하시오 :90
//3.영어 과목의 점수를 입력하시오:70
//일반 수학 과목의 점수를 입력하시오:80
//평균 점수는 80.0점 입니다.

import java.util.Scanner;
class Score{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int com, cpro, eng, math, tot, avg;
   System.out.println("컴퓨터 개론 과목의 점수를 입력하시오");
   com = sc.nextInt();
   System.out.println("C언어 프로그래밍 과목의 점수를 입력하시오");
   cpro = sc.nextInt();
   System.out.println("영어 과목의 점수를 입력하시오");
   eng = sc.nextInt();
   System.out.println("일반 수학 과목의 점수를 입력하시오");
   math = sc.nextInt();
   tot = com + cpro + eng + math;
   avg = tot / 4;
   System.out.println("평균 점수는"+avg+"점 입니다");
   }
}