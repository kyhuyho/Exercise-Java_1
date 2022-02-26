package Exercise_1;

public class Ex3 {

	public static void PTB2(double a, double b, double c) {
		if (a == 0) {
			if (b == 0 && c != 0)
				System.out.println("Pt VN");
			else if (b == 0 && c == 0)
				System.out.println("Pt có VSN");
			else
				System.out.println("Pt có nghiệm x=" + (-c / b));
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0)
				System.out.println("Pt VN");
			else if (delta == 0)
				System.out.println("Pt có nghiệm kép x1=x2=" + (-b / 2 * a));
			else {
				System.out.println("x1=" + (-b + Math.sqrt(delta)) / 2 * a);
				System.out.println("x1=" + (-b - Math.sqrt(delta)) / 2 * a);
			}
		}
	}

	public static void main(String[] args) {
		PTB2(1, -3, 2);

	}

}
