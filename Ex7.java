package Exercise_1;

public class Ex7 {

	public static void Ngay(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng " + month + " năm " + year + " có " + "31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng " + month + " năm " + year + " có " + "30 ngày");
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println("Tháng " + month + " năm " + year + " có " + "29 ngày");
			else
				System.out.println("Tháng " + month + " năm" + year + " có " + "28 ngày");
			break;

		}

	}

	public static void main(String[] args) {
		Ngay(8, 2002);

	}

}
