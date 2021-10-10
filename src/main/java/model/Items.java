package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Oct 5, 2021
 */

@Entity
@Table(name = "ITEMS")
public class Items {
	@Id
	@Column(name = "ID")
	int id;
	@Column(name = "NAME")
	String name;
	@Column(name = "DESCRIPTION")
	String description;
	
	/**
	 * 
	 */
	public Items() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Items(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return ("  Item:\n   [Id: " + this.id + "]\n   [Name: " + this.name + "]\n   [Description: "
				+ this.description + "]");
	}
}
