import java.util.Scanner;
class Comparision
{
	public static void main(String arg[])
	{
		float x , y;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two values with 3 deciamal space ");
		x = s.nextFloat();
		y = s.nextFloat();

		x = x*1000;
		y = y*1000;

		if (x==y)
			System.out.println("on comapring both the numbers are same ");
		else
			System.out.println("values entered are different");

	}
}