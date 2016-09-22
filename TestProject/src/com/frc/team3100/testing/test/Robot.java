package com.frc.team3100.testing.test;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

public class Robot extends IterativeRobot {
	
	public RobotBase base;
	public SpeedController motor1;
	
	public void robotInit() {
		motor1 = new Victor(1);
		
		base = new RobotBase(motor1);
	}

	public void autonomousPeriodic() {
		base.go(true);
	}
}
