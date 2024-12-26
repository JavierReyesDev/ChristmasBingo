package christmas_bingo;

import java.util.ArrayList;
import java.util.Scanner;

public class ChristmasBingo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		GameSets gs = new GameSets();
		int[][] all_numbers = gs.getAll_numbers();

		AsciiArt aa = new AsciiArt();
		String header = aa.getHeader();

		int option, randomIndex, set_juego, selectedNumber;

		ArrayList<Integer> number_list = new ArrayList<>();
		ArrayList<Integer> scored_list = new ArrayList<>();

		System.out.println(header + "\nChoose your destiny:\n1 - Let's play Christmas Bingo\n0 - Let's be a Grinch");

		do {
			option = scanner.nextInt();
			scanner.nextLine();
			if (option == 1) {
				// The user selects a game set, and the number_list is populated with the numbers associated with that game set
				System.out.println("\nChoose a game set:\n1 - Set 1\n2 - Set 2\n3 - Set 3");
				do {
					set_juego = scanner.nextInt();
					scanner.nextLine();
					if (set_juego == 1 || set_juego == 2 || set_juego == 3) {
						for (int i = 0; i < all_numbers[set_juego - 1].length; i++) {
							number_list.add(all_numbers[set_juego - 1][i]);
						}
					} else {
						System.out.println("\nInvalid option, try again");
					}
				} while (set_juego != 1 && set_juego != 2 && set_juego != 3);

				System.out.println("\n(GameSet " + set_juego + " selected)");

				do {
					System.out.println("\n[Press 'Enter']");
					String enter = scanner.nextLine();
					if (enter.isEmpty()) {
						randomIndex = (int) (Math.random() * number_list.size());
						selectedNumber = number_list.get(randomIndex);

						// The selectedNumber is removed from the list to prevent duplication
						number_list.remove(randomIndex);
						// The selectedNumber is added to the scored_list to track scored items
						scored_list.add(selectedNumber);

						System.out.println("> Scored number: " + selectedNumber);
						System.out.println("> Scored numbers: " + scored_list);
					} else {
						System.out.println("You must press 'Enter'");
					}
				} while (!number_list.isEmpty());
				System.out.println("The game is ended");
			} else if (option == 0) {
				System.out.println("Go find yourself a corner");
			} else {
				System.out.println("\nInvalid option, try again");
			}
		} while (option != 0 && option != 1);
		scanner.close();

	}

}
