package com.frc.team3100.testing.test;

import edu.wpi.first.wpilibj.SpeedController;

public class RobotBase {
	
	public SpeedController motor1;
	
	public RobotBase(SpeedController m1) {
		motor1 = m1;
	}
	
	public void go(boolean b) {
		if (b) {
			motor1.set(1);
		}
		else {
			motor1.set(-1);
		}
	}

}
