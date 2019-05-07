package Firma_Remontowa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// oblicz obwód i objętość pokoju
		Scanner sc = new Scanner(System.in);
		double a, b, H;
		double pakietFull = 0;
		System.out.println("Obliczanie V:");
		System.out.println("Podaj a");
		a = sc.nextDouble();
		System.out.println("b:");
		b = sc.nextDouble();
		System.out.println("H:");
		H = sc.nextDouble();
		double V = a * b * H;
		double Ob = 2 * a + 2 * b;
		System.out.println("V wynosi: " + V + " metrów kwadratowych.");
		System.out.println("Ob wynosi: " + Ob + "metrów.");

		double gipsowanie, malowanie, panele, listwy;
		double sumaPScian = 2 * (a * H) + 2 * (b * H);
		double sufitP = a * b;
		gipsowanie = sumaPScian * 30;
		malowanie = (sumaPScian + sufitP) * 15;
		panele = sufitP * 20;
		listwy = 10 * Ob;
		pakietFull = gipsowanie + malowanie + panele + listwy;
		double[] uslugi = { gipsowanie, malowanie, panele, listwy };

		int question = JOptionPane.showConfirmDialog(null, "Lecimy cały pakiet?");

		if (question == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Koszt całego pakietu: " + pakietFull);
		} else if (question == JOptionPane.NO_OPTION) {
			System.out.println("Ile usług chciałbyś wybrać?");
			int i = sc.nextInt();
			System.out.println("[1] Gipsowanie \n" + "[2]Malowanie \n" + "[3]Panele \n" + "[4]Listyw");
			double rachunek = 0;

			int usluga;

			while (i > 0) {
				usluga = sc.nextInt();
				switch (usluga) {
				case 1:
					rachunek += uslugi[0];
					System.out.println("gipsowanie: " + gipsowanie);
					break;
				case 2:
					rachunek += uslugi[1];
					System.out.println("malowanie: " + malowanie);
					break;
				case 3:
					rachunek += uslugi[2];
					System.out.println("panele: " + panele);
					break;
				case 4:
					rachunek += uslugi[3];
					System.out.println("listwy: " + listwy);
					break;

				default:
					break;
				}
				System.out.println("aktualny rachunek: " + rachunek);
				i--;
				System.out.println(i);
			}

		}

//		  System.out.println("Koszt całego pakietu: " + pakietFull);
//		  System.out.println("Koszt gipsowania 4 ścian: " + gipsowanie);
//		  System.out.println("Koszt malowania 4 ścian i sufitu: " + malowanie);
//		  System.out.println("Koszt paneli podłogowych: " + panele);
//		  System.out.println("Koszt listew: " + listwy);

	}

}
