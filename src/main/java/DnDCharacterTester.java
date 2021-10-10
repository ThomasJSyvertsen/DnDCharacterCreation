import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import controller.DnDCharacterHelper;
import controller.ItemsHelper;
import model.Attributes;
import model.DnDCharacter;
import model.Items;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Oct 5, 2021
 */
public class DnDCharacterTester {
	static Random rand = new Random();
	
	public static void main(String[] args) {
		Attributes att1 = new Attributes(nextAttribute(), nextAttribute(), nextAttribute(), nextAttribute(), nextAttribute(), nextAttribute());
		Attributes att2 = new Attributes(nextAttribute(), nextAttribute(), nextAttribute(), nextAttribute(), nextAttribute(), nextAttribute());
		
		int itemId1 = 1;
		int itemId2 = 2;
		int itemId3 = 3;
		String item1Name = "Bag of holding";
		String item2Name = "Dagger";
		String item3Name = "Slingshot";
		String item1Description = "Can hold a large number of items";
		String item2Description = "You can stab whatever you want with it";
		String item3Description = "Throw a rock kinda fast";
		
		Items item1 = new Items(itemId1, item1Name, item1Description);
		Items item2 = new Items(itemId2, item2Name, item2Description);
		Items item3 = new Items(itemId3, item3Name, item3Description);
		List<Items> items1 = new ArrayList<Items>();
		List<Items> items2 = new ArrayList<Items>();
		items1.add(item1);
		items1.add(item2);
		items2.add(item2);
		items2.add(item3);
		
		ItemsHelper ih = new ItemsHelper();
		ih.insertItems(item1);
		ih.insertItems(item2);
		ih.insertItems(item3);
		
		String characterName1 = "Mister Killsalot";
		String characterName2 = "Sir Staberson";
		String playerName1 = "Thomas";
		String playerName2 = "Rena";
		int hitPoints1 = 5;
		int hitPoints2 = 10;
		int hitDamage1 = 30;
		int hitDamage2 = 40;
		DnDCharacter player1 = new DnDCharacter(characterName1, playerName1, att1, hitPoints1, hitDamage1);
		DnDCharacter player2 = new DnDCharacter(characterName2, playerName2, att2, hitPoints2, hitDamage2);
		player1.setItems(items1);
		player2.setItems(items2);
		
		DnDCharacterHelper dch = new DnDCharacterHelper();
		dch.insertCharacter(player1);
		dch.insertCharacter(player2);
		
		List<DnDCharacter> allChars = dch.showAllDnDCharacters();		
		
		for (DnDCharacter dnd: allChars) {
			System.out.println(dnd.toString());
		}
	}
	
	private static int nextAttribute() {
		return rand.nextInt(15) + 6;
	}
}
