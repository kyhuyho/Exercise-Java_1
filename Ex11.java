package Exercise_1;

public class Ex11 {

	public static void GiaiThuaCach(int number) {
		int gt = 1;
		for (int i = 1; i <= number; i++) {
			if (number % 2 == i % 2)
				gt *= i;
		}
		System.out.println(number + "!!=" + gt);
	}

	public static void main(String[] args) {
		GiaiThuaCach(7);

	}

}
