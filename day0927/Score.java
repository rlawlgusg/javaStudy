//����))
//� �л��� �̹� �б⿡ ��ǻ�� ���� C��� ���α׷��� ���� �Ϲ� ������ ����
//��û�Ͽ��ٰ� ����, �� ������ ������ �Է��ϸ� �� �л��� �̹� �б� ��� ������
//����ϴ� ���α׷��� �ۼ��϶�
//1.��ǻ�� ���� ������ ������ �Է��Ͻÿ� :80
//2.C��� ���α׷��� ������ ������ �Է��Ͻÿ� :90
//3.���� ������ ������ �Է��Ͻÿ�:70
//�Ϲ� ���� ������ ������ �Է��Ͻÿ�:80
//��� ������ 80.0�� �Դϴ�.

import java.util.Scanner;
class Score{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int com, cpro, eng, math, tot, avg;
   System.out.println("��ǻ�� ���� ������ ������ �Է��Ͻÿ�");
   com = sc.nextInt();
   System.out.println("C��� ���α׷��� ������ ������ �Է��Ͻÿ�");
   cpro = sc.nextInt();
   System.out.println("���� ������ ������ �Է��Ͻÿ�");
   eng = sc.nextInt();
   System.out.println("�Ϲ� ���� ������ ������ �Է��Ͻÿ�");
   math = sc.nextInt();
   tot = com + cpro + eng + math;
   avg = tot / 4;
   System.out.println("��� ������"+avg+"�� �Դϴ�");
   }
}