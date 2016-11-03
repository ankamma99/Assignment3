
import java.util.Scanner;

public class ArmstrongNum

{

	public static void main(String args[]) {

		int n, s;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		n = in.nextInt();
		int a = n;
	
		while (n > 0) {

			s = n % 10;
			n = n / 10;
			sum = sum + s * s * s;

		}
		System.out.println("sum is  :" + sum);

		if (sum == a) {
			System.out.println("the number is Armstrong number");
		} else {
			System.out.println("the number is not a Armstrong number");
		}

	}

}
