package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 @Entity
@Table(name="honeyjars")
public class Honeyjar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double volume;
	
	@OneToOne(mappedBy="honeyjar", cascade=CascadeType.ALL)
	@JoinColumn
	private Bear owner;
 	public int getId() {
		return id;
	}
 	public void setId(int id) {
		this.id = id;
	}
 	public double getVolume() {
		return volume;
	}
 	public void setVolume(double volume) {
		this.volume = volume;
	}
 	public Bear getOwner() {
		return owner;
	}
 	public void setOwner(Bear owner) {
		this.owner = owner;
	}
 	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(volume);
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
		Honeyjar other = (Honeyjar) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}
 	@Override
	public String toString() {
		return "Honeyjar [id=" + id + ", volume=" + volume + "]";
	}
 	public Honeyjar(int id, double volume) {
		super();
		this.id = id;
		this.volume = volume;
	}
 	public Honeyjar() {
		super();
	}
	
	
}
