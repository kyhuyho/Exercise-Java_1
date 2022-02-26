package Exercise_1;

import java.text.DecimalFormat;

public class Ex4 {

	public static void HPT(double a, double b, double c, double d, double e, double f) {
		double D, Dx, Dy, x, y;
		D = a * e - d * b;
		Dx = c * e - f * b;
		Dy = f * a - c * d;
		if (D != 0) {
			x = Dx / D;
			y = Dy / D;
			System.out.println("Nghiệm của HPT là:(" + x + "," + y + ")");
		} else {
			if (Dx + Dy == 0)
				System.out.println("HPT có VSN");
			else
				System.out.println("HPT VN");
		}

	}

	public static void main(String[] args) {
		HPT(1, -1, 3, 3, -4, 2);

	}

}
