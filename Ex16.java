package Exercise_1;

public class Ex16 {

	public static void SDX(int M) {
		int n = 0;
		int temp = M;
		for (; M > 0;) {
			int x = M % 10;
			M = M / 10;
			n = n * 10 + x;

		}
		if (n == temp)
			System.out.println(temp + " là số đối xứng");
		else
			System.out.println(temp + " ko phải là số đối xứng");
	}

	public static void main(String[] args) {
		SDX(212);

	}

}
