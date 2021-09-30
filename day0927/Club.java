//참고 if(조건식1 && 조건식2) <조건식 모두 다 만족해야할때
//연습) 홍대에 있는 쌍용클럽에서는 물관리를 위하여 나이와 키를 입력받아 입장제한을 하고 있어요
//이름,나이가 20세 이상이고 키는 160 이하이면 입장가능, 그렇지 않으면 입장불가능을 출력하는 프로그램
//작성 저장 컴파일하여 실행 키도 정수로
import java.util.Scanner;
class Club{
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String name;
    int age, height;
    System.out.println("이름을 입력하세요");
    name = sc.next();
    System.out.println("나이를 입력하세요");
    age = sc.nextInt();
    System.out.println("키를 입력하세요");
    height = sc.nextInt();
    if(age>=20 && height <=160)
    System.out.println(name +"님 **입장 가능**");
    else
    System.out.println(name +"님 입장 불가");
   }
} 