package Exercise_1;

public class Ex6 {

	public static void TinhTien(int a, int b) {
		int tien = 0;
		if (b < 18)
			tien = (b - a) * 45000;
		else
			tien = (b - 18) * 60000 + (18 - a) * 45000;
		System.out.println("Tiền: " + tien);

	}

	public static void main(String[] args) {
		TinhTien(10, 35);

	}

}
