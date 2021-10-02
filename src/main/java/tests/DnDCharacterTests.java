package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

import model.DnDCharacter;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 27, 2021
 */
public class DnDCharacterTests {
	
	DnDCharacter character1;
	DnDCharacter character2;
	
	@Before
	public void init() {
		character1 = new DnDCharacter("Almi", "Thomas", 10, 5);
		character2 = new DnDCharacter("Durdan", "Trevor", 20, 2);
	}
	
	@Test
	public void takeDamage_Int_ReduceHitPoints() {
		//ARRANGE
		int damageToTake;
		int currentHitPoints;
		
		//ACT
		damageToTake = 5;
		currentHitPoints = 5;
		
		character1.takeDamage(damageToTake);
		
		//ASSERT
		assertEquals(character1.getCurrentHitPoints(), currentHitPoints);
	}
	
	@Test
	public void takeDamage_DamageToTakeGreaterThanHitPoints_ReduceTo0() {
		//ARRANGE
		int damageToTake;
		int currentHitPoints;
		
		//ACT
		damageToTake = 15;
		currentHitPoints = 0;
		character1.takeDamage(damageToTake);
		
		
		//ASSERT
		assertEquals(character1.getCurrentHitPoints(), currentHitPoints);
	}
	
	@Test
	public void doDamage_ValidDnDCharacters_UpdateCurrentHitPoints() {
		//ARRANGE
		int currentHitPointsChar1;
		int currentHitPointsChar2;
		
		//ACT
		currentHitPointsChar1 = 8;
		currentHitPointsChar2 = 15;
		character1.doDamage(character2);
		character2.doDamage(character1);
		
		//ASSERT
		assertEquals(character1.getCurrentHitPoints(), currentHitPointsChar1);
		assertEquals(character2.getCurrentHitPoints(), currentHitPointsChar2);
	}
	
	
}
