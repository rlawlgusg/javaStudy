import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      int first, second;
      Scanner sc = new Scanner(System.in);
      System.out.println("첫번째 수를 입력하세요");
      first = sc.nextInt();
      System.out.println("두번째 수를 입력하세요");
      second = sc.nextInt();
     
      System.out.println(" **결과출력** ");
      System.out.println("더한 결과는 "+(first+second)+"입니다");
      System.out.println("뺀 결과는 " +(first-second)+"입니다");
      System.out.println("곱한 결과는 "+(first*second)+"입니다"); 
      System.out.println("나눈 결과는 "+(first/second)+"입니다");
   }
}