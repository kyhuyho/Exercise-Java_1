package Exercise_1;

public class Ex5 {

	public static void SoTG(int a, int b, int c) {
		int soTG = a;
		if (a < b && b < c || a < b && a > c)
			soTG = b;
		if (a < c && b > c || a < b && b > c)
			soTG = c;
		System.out.println("Số trung gian: " + soTG);

	}

	public static void main(String[] args) {
		SoTG(1, 3, 2);

	}

}
