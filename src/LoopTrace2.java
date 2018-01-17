
public class LoopTrace2 {

	public static void main(String[] args) {
		int x = 8;
		for (int i = 1; i < x; i++) {
			for (int j = i; j >= 0 ; j-=2) {
				x--;
				System.out.println("i = " + i + ", j = " + j + ", x = " + x);
			}
		}
	}
}
