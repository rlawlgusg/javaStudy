//연습 
import java.util.Scanner;
class Rectangle{
	double width;
	double height;

	double rectanglearea(double width, double height){
		double area = width*height;
    System.out.printf("사각형의 면적은 %.1f입니다",area);
			return area;
	}
}

class RectangleTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Rectangle a = new Rectangle();
		
		System.out.println("가로 길이를 입력하세요");
		a.width = sc.nextDouble();
		System.out.println("세로 길이를 입력하세요");
		a.height = sc.nextDouble();
		a.rectanglearea(a.width,a.height);


	}
}
