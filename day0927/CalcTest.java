import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
      int first, second, add, sub, multi, div;
      Scanner sc = new Scanner(System.in);
      System.out.println("첫번째 수를 입력하세요");
      first = sc.nextInt();
      System.out.println("두번째 수를 입력하세요");
      second = sc.nextInt();
      add = first + second;
      sub = first - second;
      multi = first * second;
      div = first / second;
      System.out.println(" **결과출력** ");
      System.out.println("더한 결과는 "+add+"입니다");
      System.out.println("뺀 결과는 " +sub+"입니다");
      System.out.println("곱한 결과는 "+multi+"입니다"); 
      System.out.println("나눈 결과는 "+div+"입니다");
   }
}