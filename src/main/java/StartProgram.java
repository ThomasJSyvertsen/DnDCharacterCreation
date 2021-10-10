import java.util.List;
import java.util.Scanner;

import controller.DnDCharacterHelper;
import model.DnDCharacter;
import model.ListItem;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class StartProgram {
	
	static Scanner in = new Scanner(System.in);
	static DnDCharacterHelper ch = new DnDCharacterHelper();
	
	public static void addADnDCharacter() {
		System.out.println("Enter player name: ");
		String playerName = in.nextLine();
		System.out.println("Enter character name: ");
		String characterName = in.nextLine();
		System.out.println("Enter hit points: ");
		int hitPoints = in.nextInt();
		System.out.println("Enter hitDamage: ");
		int hitDamage = in.nextInt();
		
		DnDCharacter toAdd = new DnDCharacter(playerName, characterName, hitPoints, hitDamage);
		ch.insertCharacter(toAdd);
	}
	
	public static void main(String[] args) {
		runMenu();
	}
	
	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- Welcome to the awesome world of Dungeons and Dragons! ---");
		while (goAgain) {
			System.out.println("*  Select an item:");
			System.out.println("*  1 -- Create a character");
			System.out.println("*  2 -- Edit an character");
			System.out.println("*  3 -- Delete an character");
			System.out.println("*  4 -- View a list of characters");
			System.out.println("*  5 -- Exit the awesome program");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				addADnDCharacter();
			} else if (selection == 4) {
				viewTheList();
			} else {
				ch.cleanUp();
				System.out.println("   Goodbye!   ");
				goAgain = false;
			}
		}
	}
	
	
	private static boolean getYorN() {
		while (true) {
			String yOrn = in.nextLine();
			
			switch(yOrn) {
				case "y":
				case "Y":
					return true;
				case "n":
				case "N":
					return false;
				default:
					System.out.println("Please enter y/n");
					break;
			}
		}
	}
	
	private static void viewTheList() {
		List<DnDCharacter> allDnDCharacters = ch.showAllDnDCharacters();
		
		for(DnDCharacter singleItem : allDnDCharacters) {
			System.out.println(singleItem.toString());
		}

	}
	
	private static void endCleanUp() {
		ch.cleanUp();
		System.out.println("   Goodbye!   ");
	}
}
