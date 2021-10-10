package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Sep 23, 2021
 */

@Entity
@Table(name = "DNDCHARACTER")
public class DnDCharacter {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "PLAYERNAME")
	private String playerName;
	@Column(name = "CHARACTERNAME")
	private String characterName;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Attributes attributes;
	@Column(name = "HITPOINTS")
	private int hitPoints;
	@Column(name = "CURRENTHITPOINTS")
	private int currentHitPoints;
	@Column(name = "HITDAMAGE")
	private int hitDamage;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "DNDCHARACTER_ITEMS",
			joinColumns = @JoinColumn(name = "DNDCHARACTER_FK"),
			inverseJoinColumns = @JoinColumn(name = "ITEMS_FK")
	)
	private List<Items> items;
	

	/**
	 * 
	 */
	public DnDCharacter() {
		super();
	}

	/**
	 * @param playerName
	 * @param characterName
	 * @param hitPoints
	 * @param hitDamage
	 */
	public DnDCharacter(String playerName, String characterName, int hitPoints, int hitDamage) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
		this.hitPoints = hitPoints;
		this.hitDamage = hitDamage;
	}

	/**
	 * @param characterName
	 * @param playerName
	 * @param hitPoints
	 * @param hitDamage
	 */
	public DnDCharacter(String characterName, String playerName, Attributes attributes, int hitPoints, int hitDamage) {
		super();
		this.characterName = characterName;
		this.playerName = playerName;
		this.attributes = attributes;
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
	 * @return the attributes
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
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

	/**
	 * @return the items
	 */
	public List<Items> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
	
	@Override
	public String toString() {
		String itemsString = "";
		for (Items item: this.items) {
			itemsString += item.toString() + "\n";
		}
		return ("Character Info:\n[Player name: " + this.getPlayerName() + "]\n[Character name: " + this.getCharacterName() + "]\n[Hit Points: "
				+ this.getHitPoints() + "]\n[Current Hit Points: " + this.getCurrentHitPoints() + "]\n[Hit Damage: "
				+ this.getHitDamage() + "]\n[Attributes:\n  [Strength: " + this.attributes.getStrength() + "]\n  [Intelligence: " + this.attributes.getIntelligence()
						+ "\n  [Wisdom: " + this.attributes.getWisdom() + "]\n  [Dexterity: " + this.attributes.getDexterity() + "]\n  [Constitution: " 
						+ this.attributes.getConstitution() + "]\n  [Charisma: " + this.attributes.getCharisma() + "]\n]\n[Items:\n[" + itemsString + " ]\n]");
	}

}
