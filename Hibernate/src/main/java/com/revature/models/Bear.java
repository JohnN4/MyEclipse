package com.revature.models;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//  name="bears" sets the table's name (in the DB) to bears
@Table(name = "bears")
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
@NamedQuery(name="getBronzeBears", query="from Bear b WHERE b.color = 'bronze'")
public class Bear {

	/*
	 * @Id notates that this column should act as a primary key
	 * 
	 * @GeneratedValue Notates that this field's value is generated, not generally
	 * inserted manually. In order for Hibernate or our ORM to know how to do this,
	 * we need to provide a strategy. The IDENTITY strategy stipulates that it
	 * simply allow the insert to take place and retrieve the generated value.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Column annotation allows for other configuration on individual columns
	@Column(name = "bear_color")
	private String color;
	private String breed;
	private double height;
	private double weight;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	private Bear parent;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	private List<Bear> cubs;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cave_id")
	private Cave cave;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "honeyjar_id")
	private Honeyjar honeyjar;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
			name="bear_friends",
			joinColumns = { @JoinColumn(name="bear_a") },
			inverseJoinColumns = {@JoinColumn(name="bear_b")})
	private List<Bear> friends;
	
	public List<Bear> getFriends() {
		return friends;
	}

	public void setFriends(List<Bear> friends) {
		this.friends = friends;
	}

	public Honeyjar getHoneyjar() {
		return honeyjar;
	}

	public void setHoneyjar(Honeyjar honeyjar) {
		this.honeyjar = honeyjar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Bear getParent() {
		return parent;
	}

	public void setParent(Bear parent) {
		this.parent = parent;
	}

	public List<Bear> getCubs() {
		return cubs;
	}

	public void setCubs(List<Bear> cubs) {
		this.cubs = cubs;
	}

	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) {
		this.cave = cave;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((cubs == null) ? 0 : cubs.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bear other = (Bear) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cubs == null) {
			if (other.cubs != null)
				return false;
		} else if (!cubs.equals(other.cubs))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	



	@Override
	public String toString() {
		return "Bear [id=" + id + ", color=" + color + ", breed=" + breed + ", height=" + height + ", weight=" + weight
				+ "]";
	}

	public Bear(int id, String color, String breed, double height, double weight, Bear parent, List<Bear> cubs) {
		super();
		this.id = id;
		this.color = color;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.parent = parent;
		this.cubs = cubs;
	}

	public Bear() {
		super();
	}

}