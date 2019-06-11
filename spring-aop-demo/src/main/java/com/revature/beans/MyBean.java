package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	private MyDependency myDependency;
	
	@Autowired
	public MyBean(MyDependency myDependency) {
		this.myDependency = myDependency;
	}
	
	public void jumpOutOfAirplane() {
		System.out.println("Our bean jumps out of the airplane");
		myDependency.pullTheCord();
		if (!myDependency.isParachuteOpened()) {
			myDependency.pullBackupCord();
		}
		
		if(myDependency.isParachuteOpened()) {
			System.out.println("The bean lands safely.");
		} else {
			System.out.println("The bean lands ahead of schedule.");
		}
	}
	
	public StringBuilder getName() {
		return new StringBuilder("bean");
	}
}
