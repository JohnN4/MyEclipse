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
public class Part {
	String name;
	String desc;
	/**
	 * 
	 */
	public Part() {
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
