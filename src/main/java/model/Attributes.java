package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Oct 5, 2021
 */

@Entity
@Table(name = "ATTRIBUTES")
public class Attributes {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "STRENGTH")
	private int strength;
	@Column(name = "INTELLIGENCE")
	private int intelligence;
	@Column(name = "WISDOM")
	private int wisdom;
	@Column(name = "DEXTERITY")
	private int dexterity;
	@Column(name = "CONSTITUTION")
	private int constitution;
	@Column(name = "CHARISMA")
	private int charisma;

	/**
	 * 
	 */
	public Attributes() {
		super();
	}

	/**
	 * @param strength
	 * @param intelligence
	 * @param wisdom
	 * @param dexterity
	 * @param constitution
	 * @param charisma
	 */
	public Attributes(int strength, int intelligence, int wisdom, int dexterity, int constitution, int charisma) {
		super();
		this.strength = strength;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.charisma = charisma;
	}
	
	

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the wisdom
	 */
	public int getWisdom() {
		return wisdom;
	}

	/**
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the constitution
	 */
	public int getConstitution() {
		return constitution;
	}

	/**
	 * @param constitution the constitution to set
	 */
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	/**
	 * @return the charisma
	 */
	public int getCharisma() {
		return charisma;
	}

	/**
	 * @param charisma the charisma to set
	 */
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	
	@Override
	public String toString() {
		return ("Attributes:\n[Strength: " + this.getStrength() + "]\n[Intelligence: " + this.getIntelligence()
		+ "]\n[Wisdom: " + this.getWisdom() + "]\n[Dexterity: " + this.getDexterity() + "]\n[Constitution: " + 
				this.getConstitution() + "]\n[Charisma: " + this.getCharisma() + "]");
	}
}
