import java.util.Scanner;
class Homework02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char a;
		double width, height, radius;
		double rectangle , triangle, circle;

		System.out.println("����� ������ ������ �Է��ϼ���");
		System.out.println("�簢�� :R, �ﰢ�� :T, ��:C");
		a = sc.next().charAt(0);//char�� �Է°�
		//area = 0; ����� �ϳ��� ������ ǥ���ϰ� �ʹٸ� �ʱ�ȭ ���Ѿ���!
		//return; >>���⿡�� main�޼ҵ带 �����մϴ� 

			if(a != 'R' && a != 'T' && a != 'C'){
				System.out.println("�߸��� �Է°� �Դϴ�");
			}else{
				if(a == 'R'){
						System.out.println("R:�簢���� �������");
						System.out.println("�簢���� ���θ� �Է��Ͻÿ�");
						width = sc.nextDouble();
						System.out.println("�簢���� ���θ� �Է��Ͻÿ�");
						height = sc.nextDouble();

						rectangle = width*height;
						System.out.println("�簢���� ������ "+rectangle+"�Դϴ�");
					
					}else if(a == 'T'){
						System.out.println("T:�ﰢ���� �������");
						System.out.println("�ﰢ���� ���θ� �Է��Ͻÿ�");
						width = sc.nextDouble();
						System.out.println("�ﰢ���� ���θ� �Է��Ͻÿ�");
						height = sc.nextDouble();

						triangle = (width*height)/2;
						System.out.println("�ﰢ���� ������ "+triangle+"�Դϴ�");

					}else if (a == 'C'){
						System.out.println("C:���� �������");//3.14*������*������
						System.out.println("���� �������� �Է��Ͻÿ�");
						radius = sc.nextDouble();

						circle = radius*radius*3.14;
						System.out.println("�ﰢ���� ������ "+circle+"�Դϴ�");
					}
				}

		}
	}



	