package com.frc.team3100.testing.test;

import com.frc.team3100.testing.controllers.SpeedController;

public class TestRunner {

	public static void main(String[] args) {
		System.out.println("test start...");
		
		// mocks
		SpeedController motor1 = new SpeedController();
		
		// code to test
		RobotBase base = new RobotBase(motor1);
		
		// test code
		base.go(true);
		
		if (motor1.speed == 1) {
			System.out.println("PASS");
		}
	}

}
