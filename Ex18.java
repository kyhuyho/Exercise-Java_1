package Exercise_1;

public class Ex18 {

	public static void SoHoanHao() {
		int number = 1;
		while (number < 1000) {
			int Sum_uoc = 0;
			for (int i = 1; i < number; i++) {
				if (number % i == 0)
					Sum_uoc += i;
			}
			if (Sum_uoc == number)
				System.out.println("Số hoàn hảo: " + number);
			number++;
		}

	}

	public static void main(String[] args) {
		SoHoanHao();

	}

}
