package Exercise_1;

import java.text.DecimalFormat;

public class Ex10 {
	public static long GiaiThua(int n) {
		if (n == 1)
			return 1;
		return n * GiaiThua(n - 1);

	}

	public static void TinhToan(int n) {
		double S = 0;
		for (int i = 1; i <= (2 * n - 1); i += 2) {
			S += (double) 1 / (GiaiThua(i));
		}
		DecimalFormat dcf = new DecimalFormat("#.###");
		System.out.println("S=" + dcf.format(S));
	}

	public static void main(String[] args) {
		TinhToan(7);
	}

}
