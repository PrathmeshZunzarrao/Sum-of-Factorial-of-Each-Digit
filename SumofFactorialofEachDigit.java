import java.util.Scanner;
class SumofFactorialofEachDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int sum = 0;

		while(num > 0)
		{
			int rem = num % 10;
			int fact = 1;

			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}

			sum = sum + fact;
			num /= 10;
		}

		System.out.println("Sum of factorial of each digit : " + sum);
	}
}
