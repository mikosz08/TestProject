package choinka;

public class Main {

	public static void main(String[] args) {
		for (int k = 2; k < 10; k++) {
			for (int i = 0; i < k; i++) {
				System.out.println(" ");
				for (int j = 0; j < i; j++) {
					for (int j2 = k; j2 < k/2; j2--) {
						System.out.print(" ");
					}
					System.out.print(" *");

				}

			}
		
		}

	}

}
