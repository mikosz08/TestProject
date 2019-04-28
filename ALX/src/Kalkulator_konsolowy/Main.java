package Kalkulator_konsolowy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a:");
			double number = sc.nextDouble();
			System.out.print("b:");
			double numberTwo = sc.nextDouble();
			System.out.println("Method number: ");
			System.out.println("1) Sum up\n" + "2) Substract\n" + "3) Divide\n" + "4) Power\n" + "0) Quit");
			System.out.print(":");
			double res;
			int value;
			while (true) {
				value = sc.nextInt();
				if (value == 0) {
					System.out.println("quit");
					break;
				}
				switch (value) {
				case 1:
					res = (number + numberTwo);
					System.out.println(number + " + " + numberTwo);
					System.out.print(" = " + (res));
					break;
				case 2:
					res = (number - numberTwo);
					System.out.println(number + " - " + numberTwo);
					System.out.print(" = " + (res));
					break;
				case 3:
					res = (number / numberTwo);
					try {
						System.out.println(number + " / " + numberTwo);
						System.out.print(" = " + (res));
					} catch (ArithmeticException e1) {
						System.err.println("Dividing by zero!");
					}
					break;
				case 4:
					res = (Math.pow(number, numberTwo));
					System.out.println(number + " ^ " + numberTwo);
					System.out.print(" = " + (res));
					break;
				default:
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Wrong input, the program has ended.");
		}
	}

}
