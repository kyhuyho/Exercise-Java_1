package Exercise_1;

import java.text.DecimalFormat;

public class Ex9 {
	public static long GiaiThua(int n) {
		if (n == 1)
			return 1;
		return n * GiaiThua(n - 1);

	}

	public static void TinhToan(int n) {
		double Sum = 0;
		for (int i = 1; i <= n; i++) {
			Sum += (double) (Math.pow(-1, i)) / (GiaiThua(i));
		}
		double S = 15 + Sum;
		DecimalFormat dcf = new DecimalFormat("#.###");
		System.out.println("S=" + dcf.format(S));
	}

	public static void main(String[] args) {
		TinhToan(5);

	}

}
