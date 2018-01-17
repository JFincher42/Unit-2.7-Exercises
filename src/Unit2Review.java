
public class Unit2Review {

	public static void main(String[] args) {
		System.out.println(6 - 4 + "ten" + 8 * 9);
		System.out.println("three" + ( 4 + 5 ) % ( 1 - 2 ));
		System.out.println(1 * 2 + "three" + 4 + 5);
		System.out.println(7 % 4 + 1 + 5 / 2);
		System.out.println(5 / 4 - 8 % 4 + 7);
		System.out.println(5.0 / 4 - 6 % 2 + 3);
		System.out.println(2 - 5.7);
		System.out.println(5 / 2 + 1.0);
		System.out.println(3 + 2 + "4");
		System.out.println('g' - 'a');
		System.out.println((int) Math.abs(3 - 8.5) );
		System.out.println(Math.abs(-1.2));
		System.out.println(Math.round(1.9));
		System.out.println((int) 1.9);
		System.out.print("\nQuestion 5: ");  question5();
		System.out.println("\nQuestion 6: ");  question6();
		System.out.println("\nQuestion 7: ");  question7();
		System.out.println("\nQuestion 8: ");  question8();
		System.out.println("\nQuestion 9: ");  question9();
		System.out.println("\nQuestion 10: ");  loop();
		System.out.println("\nQuestion 11: ");  question11();
	}

	public static void question5() {
	    double j = 7.2;
	    int k = 3;
	    j = j - k + 1;
	    k = k / 2;
	    System.out.println("j is " + j + ", k is " + k);
	}
	
	public static void question6() {
		int x = 9;
		int y = x;
		System.out.println("x = " + x + " y = " + y);

		x = y - 5;
		System.out.println("x = " + x + " y = " + y);

		y = x + 2;
		x = y % 3;
		System.out.println("x = " + x + " y = " + y);
	}
	
	public static void question7() {
		int a = 12;
		int b = 3;
		for (int i = 0; i <= a; i++)  {
			b = b + i;
			a = a - i;
		}
		System.out.println("a = " + a + ", b = " + b);
	}
	
	public static void question8() {
		double b = 6.0;
		for (int a = 4; a >= 1; a = a / 2)  {
			System.out.print(a + ",   " + b + ",   ");
			b = a / 2;
		}
	}

	public static void question9() {
        for (int i = 23; i > 1; i = i - 3) {
            	System.out.print(i);
        }
   }

	public static void loop()  {
		for (int i = 6; i > 16; i += 3) {
			System.out.print(i);
		}
	}

	public static void question11() {
		for (int i = 3; i < 7; i++)  {
			for (int j = 9; j > i; j--) {
				System.out.print(i + j + " ");
			}
		}
	}
}
