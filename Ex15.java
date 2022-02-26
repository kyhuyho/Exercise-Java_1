package Exercise_1;

public class Ex15 {

	public static void SCP(int P) {
		boolean flag = false;
		for (int i = 0; i <= P; i++) {
			if (i * i == P)
				flag = true;
		}
		if (flag == false)
			System.out.println(P + " ko là số chính phương");
		else
			System.out.println(P + " là số chính phương");
	}

	public static void main(String[] args) {
		SCP(25);

	}

}
