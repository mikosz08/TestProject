package Kolko_i_Krzyzyk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[][] game = new char[3][3];
		Scanner sc = new Scanner(System.in);
		int xPos;
		int yPos;
		int gracz = 1;
		char strzal = 0;

		System.out.println("hello there");

		while (true) {
			System.out.println("Gra gracz: " + gracz);

			if (gracz == 1) {
				strzal = 'x';
			} else
				strzal = 'o';

			System.out.println("Podaj wspolrzedne x: ");
			xPos = sc.nextInt();
			System.out.println("Podaj wspolrzedne y: ");
			yPos = sc.nextInt();

			game[xPos][yPos] = strzal;
			
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game.length; j++) {
					System.out.print(game[i][j] + " ");
				}
				System.out.println();

			}

			if (game[0][0] == 'x' && game[0][1] == 'x' && game[0][2] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[1][0] == 'x' && game[1][1] == 'x' && game[1][2] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[2][0] == 'x' && game[2][1] == 'x' && game[2][2] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[0][0] == 'x' && game[1][0] == 'x' && game[2][0] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[0][1] == 'x' && game[1][1] == 'x' && game[2][1] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[0][2] == 'x' && game[1][2] == 'x' && game[2][2] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[0][0] == 'x' && game[1][1] == 'x' && game[2][2] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			} else if (game[0][2] == 'x' && game[1][1] == 'x' && game[2][0] == 'x') {
				System.out.println("Wygral gracz 1");
				break;
			}
			if (game[0][0] == 'o' && game[0][1] == 'o' && game[0][2] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[1][0] == 'o' && game[1][1] == 'o' && game[1][2] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[2][0] == 'o' && game[2][1] == 'o' && game[2][2] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[0][0] == 'o' && game[1][0] == 'o' && game[2][0] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[0][1] == 'o' && game[1][1] == 'o' && game[2][1] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[0][2] == 'o' && game[1][2] == 'o' && game[2][2] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[0][0] == 'o' && game[1][1] == 'o' && game[2][2] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			} else if (game[0][2] == 'o' && game[1][1] == 'o' && game[2][0] == 'o') {
				System.out.println("Wygral gracz 2");
				break;
			}

			if (gracz == 1) {
				gracz = 2;
			} else {
				gracz = 1;
			}

		}
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();

		}
	}
}
