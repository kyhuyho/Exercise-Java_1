package Exercise_1;

import java.text.DecimalFormat;

public class Ex8 {

	public static void TinhToan(int n) {
		double Sum = 0;
		for (int i = 1; i <= n; i++)
			Sum += (double) 1 / i;
		DecimalFormat dcf = new DecimalFormat("#.###");
		System.out.println("Sum: " + dcf.format(Sum));
	}

	public static void main(String[] args) {
		TinhToan(3);

	}

}
