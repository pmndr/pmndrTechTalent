package treasureHunt;

import java.util.Scanner;

public class treasureHunt {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String direction;

			// Main character
			HuntCreation protag = new HuntCreation("Brynn", "Paladin", "Spear");
			System.out.println("Name: " + protag.getName());
			System.out.println("Class: " + protag.getClasses());
			System.out.println("Weapon: " + protag.getWeapon());

			// Map
			HuntMap newMap = new HuntMap(10, 10);
			System.out.println("Map size: " + newMap.getX() + " by " + newMap.getY());

			// Starting position
			int currentX = (int) (Math.random() * 11);
			int currentY = (int) (Math.random() * 11);
			System.out.println("Current position: " + currentX + " by " + currentY);

			// Game mechanics

			do {
				System.out.println("Choose a direction: N, E, S or W.");
				direction = scan.nextLine();

				if (direction.equals("E")) {
					currentX = currentX + 1;
				} else if (direction.equals("W")) {
					currentX = currentX - 1;
				} else if (direction.equals("N")) {
					currentY = currentY + 1;
				} else if (direction.equals("S")) {
					currentY = currentY - 1;
				} else {
					System.out.println("Choose an actual direction!");
				}

			} while (currentX != 5 && currentY != 5);

			do {
				System.out.println("You found the treasure!");
				break;
			} while (currentX == 5 && currentY == 5);

		}

	}

}
