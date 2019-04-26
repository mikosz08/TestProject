package ButyDoSzewca;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int day;
		int howManyDays = 0;

		day = Integer
				.parseInt(JOptionPane.showInputDialog("Witam \n Którego dnia Pan/Pani oddał/a buty do szewca? (1-7)"));
		if (day < 1 || day > 7) {
			System.out.println("peanut");
		} else {
			System.out.println("ktory dzien: " + day);

			howManyDays = Integer.parseInt(JOptionPane.showInputDialog("Na ile dni zostawiłeś/aś buty?"));
			System.out.println("ile dni: " + howManyDays);
		}

		switch (dayCounter(day, howManyDays)) {
		case 1:
			System.out.println("Poniedziałek");
			break;
		case 2:
			System.out.println("Wtorek");
			break;
		case 3:
			System.out.println("Środa");
			break;
		case 4:
			System.out.println("Czwartek");
			break;
		case 5:
			System.out.println("Piątek");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Niedziela");
			break;

		default:
			System.out.println("Koniec");
			break;
		}

	}

	public static int dayCounter(int day, int howManyDays) {
		int result = 0;
		for (int i = 0; i < (day + howManyDays); result++, i++) {
			if (result == 7) {
				result = 0;

			}

		}
		return result;

	}

}
