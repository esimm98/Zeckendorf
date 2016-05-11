public class Zeckendorf {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " : " + zeck(i));
		}
	}

	public static String zeck(int n) {
		String result = "";
		for (int i = 6; i > 0; i--) {
			if (n >= fib(i)) {
				result += "1";
				n -= fib(i);
			} else if (result.length() > 0) {
				result += "0";
			}
		}
		return result;
	}

	public static int fib(int n) {
		if (n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}

}