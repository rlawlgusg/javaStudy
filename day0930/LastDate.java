import java.util.Scanner;
class LastDate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String last = "";
		int m;
		System.out.print("���� �Է��ϼ���: ");
		m= sc.nextInt();

		if(m<1 || m>12){
			 System.out.print("�߸��� �Է��Դϴ�");
			}else{
				if(m == 2){
					last = "28��";
			    }else if (m == 4 ||m == 6|| m == 9 || m ==11 ){
					last = "30��";
				}else {
					last = "31��";
				} System.out.print(m+"���� "+last+"���� �־��!");
        }
				
			}
	}
