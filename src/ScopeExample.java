
public class ScopeExample {

	public static void main(String[] args) {
		int x = 3;
		for (int i = 1; i <= 10; i++){
			System.out.println(x);
		} // i no longer exists here
		    
	} // x ceases to exist here

	public static void scopeExample() {
		for (int i = 1; i <= 10; i++){
			System.out.println(i + " squared = " + (i * i));
		}
		for (int i = 1; i <= 10; i++){
			System.out.println(i + " cubed = " + (i * i * i));
		}
	}
	
	public static void scopeExample2(){
		int x = 3;
		int y = 7;
		computeSum();
	}

	public static void computeSum() {
		int sum = x + y;
	}
}
