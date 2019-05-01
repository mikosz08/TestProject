package Funkcje_z_Petlami;

public class sumaNieparzystych {

	public static void main(String[] args) {
		// sumaNieparzystych(5);
		// fib(80);
		czyPierwsza(76);

	}

	static int sumaNieparzystych(int n) {
		int nextNum = 1;
		int res = 0;
		int resCounter = 0;
		while (true) {
			if (nextNum % 2 != 0) {
				System.out.println("Nieparzysta : " + nextNum);
				res += nextNum;
				resCounter++;
			}
			if (resCounter == n) {
				break;
			}
			nextNum++;

		}
		System.out.println("Razem: " + res);
		return res;
	}

	static long fib(int n) {
		long pierwsza = 0;
		long druga = 1;
		long trzecia = 1;
		int condition = 3;
		long t1;
		// na necie robia int a = 1; int b = 1; int temp;
		// temp = a;
		// a = b;
		// b += temp;
		while (true) {
			pierwsza = druga;
			druga = trzecia;
			trzecia = pierwsza + druga;
			// System.out.println(trzecia);
			condition++;
			// 80 = 14472334024676221;
			if (condition == n) {
				System.out.println(condition + " liczba ciagu Fibonacziego to : " + trzecia);
				break;
			}

		}

		return trzecia;
	}

	static boolean czyPierwsza(long liczba) {
		int dzielniki = 0;
		System.out.println("Start");

		if (liczba > 1) {

			for (int i = 1; i <= liczba; i++) {

				if (liczba % i == 0) {
					System.out.println(liczba + " / " + i);
					dzielniki++;
				}
				
			}
					if (dzielniki > 2) {
						System.out.println(liczba + " nie jest liczbą pierwszą bo ma " + dzielniki + " dzielniki/ów.");
						System.out.println("End.");
						return false;
					} else if (dzielniki < 3) {
						System.out.println(liczba + " jest liczbą pierwszą bo ma " + dzielniki + " dzielnik.");
						System.out.println("End.");
						return true;
					}
		} else {
			System.out.println(liczba + " nie jest liczbą pierwszą");
			System.out.println("End.");
			return false;
		}
		System.out.println("nie powiodło się");
		return false;
	}
}
