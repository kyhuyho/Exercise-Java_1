package Exercise_1;

public class Ex20 {

	public static void TimK(int n) {
		int trc = 1, sau = 1, giua, dem = 2;
		boolean k = false;
		if (n >= 2) {
			for (int i = 2; i <= n; i++) {
				giua = sau + trc;
				dem++;
				if (giua == n) {
					k = true;
					break;
				}
				trc = sau;
				sau = giua;
			}
		}
		if (n == 1 || n == 0)
			System.out.println(n + " la so fibonaci thu 1");
		else {
			if (k == true) {
				System.out.println(n + " la so fibonaci thu " + dem);
			} else
				System.out.println(n + " khong phai la so fibonaci");
		}
	}

	public static void main(String[] args) {
		TimK(8);

	}

}
