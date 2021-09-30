import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt();
		System.out.println(n);
		
		n = n >>>1;
		n = n % 10;
		System.out.println(n);
	}
}
