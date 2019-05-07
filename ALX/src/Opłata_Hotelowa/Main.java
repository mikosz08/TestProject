package Opłata_Hotelowa;

import java.awt.HeadlessException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wiek = 0;
		int iloscDni = 0;
		double rachunek = 0;
		JOptionPane.showMessageDialog(null,
				" Witamy w naszym Hotelu \n Podaj swój wiek i jak długo chcesz u nas zostać");

		try {
			wiek = Integer.parseInt(JOptionPane.showInputDialog("Wiek:"));
			iloscDni = Integer.parseInt(JOptionPane.showInputDialog("Ilosc dni:"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Podano Zła Wartosc", null, JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (HeadlessException e) {
			e.printStackTrace();
		}

		System.out.println("Wiek klienta: " + wiek + ", ilosc dni: " + iloscDni);

		if (wiek < 18) {
			System.out.println("nieletni");
			rachunek = iloscDni * 100;

		} else if (wiek >= 18 && wiek < 65) {

			if (iloscDni == 1) {
				rachunek = 200;
			} else if (iloscDni >= 2 && iloscDni < 5) {
				rachunek = 180 * iloscDni;
				System.out.println("180 * " + iloscDni);
			} else if (iloscDni > 5) {
				rachunek = 150 * iloscDni;
			}
			System.out.println("dorosły");
		} else if (wiek >= 65) {
			System.out.println("emeryt");
			if (iloscDni == 1) {
				rachunek = 200 * 0.9;
			} else if (iloscDni >= 2 && iloscDni < 5) {
				rachunek = 180 * iloscDni * 0.9;
			} else if (iloscDni > 5) {
				rachunek = 150 * iloscDni * 0.9;
			}
		}
		// ---------
		JOptionPane.showMessageDialog(null, "Rachunek wynosi: " + rachunek);
	}

}
