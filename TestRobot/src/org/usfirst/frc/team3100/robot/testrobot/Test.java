package org.usfirst.frc.team3100.robot.testrobot;

import org.usfirst.frc.team3100.testing.MockSpeedController;
import org.usfirst.frc.team3100.testing.MockXBoxController;

public class Test {
	private static MockXBoxController controller;
	
	private static MockSpeedController rightDrive;
	private static MockSpeedController leftDrive;
	
	private static RobotBase robot;
	
	public static void main(String[] args) {
		controller = new MockXBoxController();
		rightDrive = new MockSpeedController();
		leftDrive = new MockSpeedController();
		
		robot = new RobotBase(controller, leftDrive, rightDrive);
		
		test1();
	}
	
	public static void test1() {
		controller.leftStickX = 1;
		leftDrive.speed = 0;
		rightDrive.speed = 0;

		robot.dummymethod();

		System.out.println("Right speed: " + rightDrive.speed);
		System.out.println("Left speed: " + leftDrive.speed);
	}
}
