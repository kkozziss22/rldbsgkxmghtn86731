package 제03차시;

public class 실습04 {

	public static void main(String[] args) {
		// if문의 예
		int n = 11;
		if (n % 2 == 0)
			System.out.println(n + "은 짝수입니다.");
		else
			System.out.println(n + "은 홀수입니다.");

		// switch문의 예 }
		int m = 7;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(m + "월의 마지막 날은 31일입니다.");
			break;
		case 2:
			System.out.println(m + "월의 마지막 날은 28일입니다.");
			break;
		default:
			System.out.println(m + "월의 마지막 날은 30일입니다.");
		}
	}
}
