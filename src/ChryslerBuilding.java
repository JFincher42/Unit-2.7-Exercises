
public class ChryslerBuilding {

	public static void main(String[] args) {
		printChryslerBuilding();

	}

	public static void printChryslerBuilding() {
		printSpire();
		printTopFloor();
		printMidRise();
		printMidFloors();
		printBase();
		printFoundation();
	}
	
	public static void printSpire() {
		for (int row=0; row<4; row++) {
			for (int space=0; space<10; space++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
		
		for (int row=0; row<4; row++) {
			for (int leadSpace=0; leadSpace<9-row; leadSpace++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int innerSpace=0; innerSpace<row; innerSpace++) {
				System.out.print(" ");
			}
			System.out.print(":");
			for (int innerSpace=0; innerSpace<row; innerSpace++) {
				System.out.print(" ");
			}
			System.out.println("\\");

			for (int leadSpace=0; leadSpace<9-row; leadSpace++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int innerSpace=0; innerSpace<row; innerSpace++) {
				System.out.print(" ");
			}
			System.out.print(":");
			for (int innerSpace=0; innerSpace<row; innerSpace++) {
				System.out.print(" ");
			}
			System.out.println("|");

		}
		
	}
	
	public static void printTopFloor() {
		for (int space=0; space<6; space++) {
			System.out.print(" ");
		}
		System.out.print("+");
		for (int dash=0; dash<7; dash++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void printMidRise() {
		
	}
	
	public static void printMidFloors() {
		
	}
	
	public static void printBase() {
		
	}
	
	public static void printFoundation() {
		
	}
	
}
