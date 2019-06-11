/**
 * 
 */
package edu.sollers.bootcamp.spring.simple;

import org.springframework.stereotype.Component;

/**
 * @author praka
 *
 */
@Component
public class Part1 {
	String name;
	String desc;
	/**
	 * 
	 */
	public Part1() {
		name = "";
		desc = "";
		
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
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	

}
