package Funkcje;

import java.util.Scanner;

public class metody {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 stopa = 0,3048 metra
		 */
		// System.out.println("to : " + metersToFoots() + " stopa/y.");
		// System.out.printf("%.2f", farToCelc());
		// System.out.println();
		// System.out.printf("%.2f", celcToFar());
		dayOfMonth();
	}

	public static double metersToFoots() {
		System.out.println("Metry na stopy, podaje m: ");
		double meters = sc.nextDouble();
		double res = meters * (0.3048);
		return res;
	}

	public static double farToCelc() {
		System.out.println("Ile jest stopni Fahrenheit'a?: ");
		int far = sc.nextInt();
		// °C = (°F − 32) /1.8
		double celc = (far - 32) / 1.8;
		return celc;
	}

	public static double celcToFar() {
		// °F = (°C × 1.8) + 32
		System.out.println("Ile jest stopni Celsjusza?: ");
		int celc = sc.nextInt();
		double far = (celc * 1.8) + 32;
		return far;
	}

	public static void dayOfMonth() {
		// dla podanego miesiaca zwraca ilos dni
		// 1 (styczen) = 31
		// Każdy rok podzielny przez 4 jest rokiem przestępnym. luty = 30/28
		String[] days = { "Styczen", "Luty", "Marzec", "Kwiecien", "Maj", "Czerwiec", "Lipiec", "Sierpien", "Wrzesien",
				"Pazdziernik", "Listopad", "Grudzien" };
		int i = 0;
		int howManyDays = 0;
		int sum = 0;
		while (i < 12) {
			i++;
			if (i == 8) {
				howManyDays = 31;
			} else if (i % 2 == 0) {
				howManyDays = 30;
			} else if (i % 2 != 0) {
				howManyDays = 31;
			}
			if (i == 2) {
				int year = -1;
				System.out.println("Któy mamy rok?");
				year = sc.nextInt();
				if (year % 2 == 0) {
					howManyDays = 29;
				} else {
					howManyDays = 28;
				}
			}
			if (i > 7) {
				if (i % 2 == 0) {
					howManyDays = 31;
				} else if (i % 2 != 0) {
					howManyDays = 30;
				}
			}

			System.out.println(days[i - 1] + " ma " + howManyDays + " dni.");
			sum += howManyDays;

		}
		System.out.println("razem : " + sum);
	}

}
