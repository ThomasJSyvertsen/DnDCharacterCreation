package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Sep 23, 2021
 */

@Entity
@Table(name = "dndcharacter")
public class DnDCharacter {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "PLAYERNAME")
	private String playerName;
	@Column(name = "CHARACTERNAME")
	private String characterName;
	@Column(name = "HITPOINTS")
	private int hitPoints;
	@Column(name="CURRENTHITPOINTS")
	private int currentHitPoints;
	@Column(name = "HITDAMAGE")
	private int hitDamage;

	/**
	 * 
	 */
	public DnDCharacter() {
		super();
	}

	/**
	 * @param characterName
	 * @param playerName
	 * @param hitPoints
	 * @param hitDamage
	 */
	public DnDCharacter(String characterName, String playerName, int hitPoints, int hitDamage) {
		super();
		this.characterName = characterName;
		this.playerName = playerName;
		this.hitPoints = hitPoints;
		this.hitDamage = hitDamage;
		this.currentHitPoints = hitPoints;
	}
	
	public void takeDamage(int damage) {
		if (damage <= this.currentHitPoints) {
			currentHitPoints -= damage;
		} else {
			currentHitPoints = 0;
		}

	}
	
	public void doDamage(DnDCharacter toTakeDamage) {
		toTakeDamage.takeDamage(this.hitDamage);
	}
	
	public String returnDnDCharacterDetails() {
			return ("Player name: " + this.getPlayerName() + " Character name: " + this.getCharacterName() + " Hit Points: " 
	+ this.getHitPoints() + " Current Hit Points: " + this.getCurrentHitPoints() + " Hit Damage: " + this.getHitDamage());
		}

	/**
	 * @return the currentHitPoints
	 */
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	/**
	 * @param currentHitPoints the currentHitPoints to set
	 */
	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the hitDamage
	 */
	public int getHitDamage() {
		return hitDamage;
	}

	/**
	 * @param hitDamage the hitDamage to set
	 */
	public void setHitDamage(int hitDamage) {
		this.hitDamage = hitDamage;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
