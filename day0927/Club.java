//���� if(���ǽ�1 && ���ǽ�2) <���ǽ� ��� �� �����ؾ��Ҷ�
//����) ȫ�뿡 �ִ� �ֿ�Ŭ�������� �������� ���Ͽ� ���̿� Ű�� �Է¹޾� ���������� �ϰ� �־��
//�̸�,���̰� 20�� �̻��̰� Ű�� 160 �����̸� ���尡��, �׷��� ������ ����Ұ����� ����ϴ� ���α׷�
//�ۼ� ���� �������Ͽ� ���� Ű�� ������
import java.util.Scanner;
class Club{
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String name;
    int age, height;
    System.out.println("�̸��� �Է��ϼ���");
    name = sc.next();
    System.out.println("���̸� �Է��ϼ���");
    age = sc.nextInt();
    System.out.println("Ű�� �Է��ϼ���");
    height = sc.nextInt();
    if(age>=20 && height <=160)
    System.out.println(name +"�� **���� ����**");
    else
    System.out.println(name +"�� ���� �Ұ�");
   }
} 