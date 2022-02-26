package Exercise_1;

public class Ex12 {

	public static void TongTich(int number) {
		int Sum = 0, Mul = 1;
		do {
			int sd = number % 10;
			number /= 10;
			Sum += sd;
			Mul *= sd;
		} while (number > 0);
		System.out.println("Sum: " + Sum + " , Mul: " + Mul);

	}

	public static void main(String[] args) {
		TongTich(234);

	}

}
