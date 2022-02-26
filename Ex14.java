package Exercise_1;

public class Ex14 {

	public static void SoNguyenTo(int number) {
		int dem = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				dem++;
		}
		if (dem == 2)
			System.out.println(number + " là số nguyên tố");
		else
			System.out.println(number + " ko phải là số nguyên tố");
	}

	public static void main(String[] args) {
		SoNguyenTo(12);

	}

}
