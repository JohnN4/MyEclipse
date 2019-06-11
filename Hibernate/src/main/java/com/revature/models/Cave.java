package com.revature.models;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="caves")
public class Cave {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="cubic_meters")
	private double cubicMeters;
	private int comfort;
	
	@OneToMany(fetch=FetchType.EAGER, cascade= {CascadeType.ALL})
	@JoinColumn(name="cave_id")
	List<Bear> occupants;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCubicMeters() {
		return cubicMeters;
	}
	public void setCubicMeters(double cubicMeters) {
		this.cubicMeters = cubicMeters;
	}
	public int getComfort() {
		return comfort;
	}
	public void setComfort(int comfort) {
		this.comfort = comfort;
	}
	public List<Bear> getOccupants() {
		return occupants;
	}
	public void setOccupants(List<Bear> occupants) {
		this.occupants = occupants;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + comfort;
		long temp;
		temp = Double.doubleToLongBits(cubicMeters);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((occupants == null) ? 0 : occupants.hashCode());
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
		Cave other = (Cave) obj;
		if (comfort != other.comfort)
			return false;
		if (Double.doubleToLongBits(cubicMeters) != Double.doubleToLongBits(other.cubicMeters))
			return false;
		if (id != other.id)
			return false;
		if (occupants == null) {
			if (other.occupants != null)
				return false;
		} else if (!occupants.equals(other.occupants))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cave [id=" + id + ", cubicMeters=" + cubicMeters + ", comfort=" + comfort + ", occupants=" + occupants
				+ "]";
	}
	public Cave(int id, double cubicMeters, int comfort, List<Bear> occupants) {
		super();
		this.id = id;
		this.cubicMeters = cubicMeters;
		this.comfort = comfort;
		this.occupants = occupants;
	}
	public Cave() {
		super();
	}
}
