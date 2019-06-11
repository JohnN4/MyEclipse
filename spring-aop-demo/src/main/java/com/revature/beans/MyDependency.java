package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class MyDependency {

	boolean parachuteOpened;
	
	public void pullTheCord() {
		if (Math.random() > 0.28) {
			System.out.println("The parachute opened!");
			parachuteOpened = true;
		} else {
			System.out.println("That's a bad sign.");
		}
	}

	public boolean isParachuteOpened() {
		return parachuteOpened;
	}

	public void pullBackupCord() {
		if (Math.random() > 0.30) {
			System.out.println("The backup parachute opened!");
			parachuteOpened = true;
		} else {
			System.out.println("That's a really bad sign.");
		}		
	}

	
}
