//���� 
import java.util.Scanner;
class Rectangle{
	double width;
	double height;

	double rectanglearea(double width, double height){
		double area = width*height;
    System.out.printf("�簢���� ������ %.1f�Դϴ�",area);
			return area;
	}
}

class RectangleTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Rectangle a = new Rectangle();
		
		System.out.println("���� ���̸� �Է��ϼ���");
		a.width = sc.nextDouble();
		System.out.println("���� ���̸� �Է��ϼ���");
		a.height = sc.nextDouble();
		a.rectanglearea(a.width,a.height);


	}
}
