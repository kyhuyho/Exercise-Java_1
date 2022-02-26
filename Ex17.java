package Exercise_1;

public class Ex17 {

	public static void CacSoNT(int n) {
		System.out.println("Các số nguyên tố nhỏ hơn " + n + " là:");
		for (int number = 2; number < n; number++) {
			int count = 0;
			for (int i = 2; i < Math.sqrt(number); i++) {
				if (number % i == 0)
					count++;
			}
			if (count == 0)
				System.out.println(number);
		}

	}

	public static void main(String[] args) {
		CacSoNT(123);

	}

}
