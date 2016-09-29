package org.usfirst.frc.team3100.robot.testrobot;

import org.usfirst.frc.team3100.base.interfaces.IXBoxController;

import edu.wpi.first.wpilibj.SpeedController;

public class RobotBase {
	private final IXBoxController controller;
	private final SpeedController leftDrive;
	private final SpeedController rightDrive;
	
	
	public RobotBase(IXBoxController controller, SpeedController leftDrive, SpeedController rightDrive) {
		this.controller = controller;
		this.leftDrive = leftDrive;
		this.rightDrive = rightDrive;
		
	}
	
	public void dummymethod() {
		leftDrive.set(controller.getLeftStickX());
	}
}
