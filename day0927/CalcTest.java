import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
      int first, second, add, sub, multi, div;
      Scanner sc = new Scanner(System.in);
      System.out.println("ù��° ���� �Է��ϼ���");
      first = sc.nextInt();
      System.out.println("�ι�° ���� �Է��ϼ���");
      second = sc.nextInt();
      add = first + second;
      sub = first - second;
      multi = first * second;
      div = first / second;
      System.out.println(" **������** ");
      System.out.println("���� ����� "+add+"�Դϴ�");
      System.out.println("�� ����� " +sub+"�Դϴ�");
      System.out.println("���� ����� "+multi+"�Դϴ�"); 
      System.out.println("���� ����� "+div+"�Դϴ�");
   }
}