//����) ���ο����� �ų� 40�� �̻��� ����鿡�� ����ϰ����� �ǽ��ϰ� �ֽ��ϴ�. 
//�̸��� ���̸� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� �ۼ��ϰ�
//�����ϰ� �������Ͽ� �����غ��ϴ� 
import java.util.Scanner;
class Age{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int age;
   System.out.println("�̸��� �Է��ϼ���");
   name = sc.next();
   System.out.println("���̸� �Է��ϼ���");
   age = sc.nextInt();
   if(age>=40)
   System.out.println(name+"��, ����ϰ��� ����� �Դϴ�");
   else
   System.out.println(name+"�� ����ϰ��� ����ڰ� �ƴմϴ�");
   }
}