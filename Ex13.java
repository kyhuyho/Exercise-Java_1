package Exercise_1;

public class Ex13 {
	public static void UCLN_BCNN(int a, int b) {
		int Mul = a * b;
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		System.out.println("UCLN là: " + a);
		System.out.println("BCNN là: " + Mul / a);
	}

	public static void main(String[] args) {
		UCLN_BCNN(2, 9);

	}

}
