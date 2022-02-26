package Exercise_1;

public class Ex1 {

	public static void TimMax(double a, double b, double c) {
		double Max = a;
		if (Max < b)
			Max = b;
		if (Max < c)
			Max = c;
		System.out.println("Max: " + Max);
	}

	public static void main(String[] args) {
		TimMax(5.5, 8.8, 4);
	}

}
