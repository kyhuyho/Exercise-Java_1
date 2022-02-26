package Exercise_1;

public class Ex2 {
	public static void PTB1(double a, double b) {
		if (a == 0 && b != 0)
			System.out.println("Pt VN");
		else if (a == 0 && b == 0)
			System.out.println("Pt có VSN");
		else
			System.out.println("Pt có nghiêm x=" + (-b / a));
	}

	public static void main(String[] args) {
		PTB1(3, 4);

	}

}
