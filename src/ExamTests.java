import java.util.Scanner;

public class ExamTests {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = console.nextInt();
		int ones = num % 10;
		int tens = num % 100 / 10;
		//int tens = num / 10 % 10;
		int hundreds = num % 1000 / 100;
		//int hundreds = num / 100 % 10;
		System.out.print(ones + "\n" + tens + "\n" + hundreds);
		
		System.out.print("\n\n");
		question2TestA();
		System.out.print("\n\n");
		question2TestB();
	}
	
	public static void question2TestA()
	{
		for (int rows=0; rows<5; rows++) {
			for (int space=0; space<4-rows; space++) {
				System.out.print(" ");
			}
			for (int num=0; num<=rows; num++) {
				System.out.print(rows+1);
			}
			System.out.println();
		}
	}

	public static void question2TestB()
	{
		for (int rows=1; rows<=5; rows++) {
			for (int space=1; space<=rows-1; space++) {
				System.out.print(" ");
			}
			for (int num=5; num>=rows-6; num--) {
				System.out.print(rows);
			}
			System.out.println();
		}
	}

}
