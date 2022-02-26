package Exercise_1;

public class Ex19 {
	public static int Fib(int n) {
		if (n <= 2)
			return 1;
		return Fib(n - 1) + Fib(n - 2);
	}

	public static void XuatFib(int n) {
        System.out.println("Dãy Fibonaci là: ");
		for (int i = 1; i <= n; i++)
			System.out.println(Fib(i) + " ");
	}

	public static void main(String[] args) {
		XuatFib(6);

	}

}
