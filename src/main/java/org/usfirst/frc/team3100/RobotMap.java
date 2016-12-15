package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.*;

public class RobotMap {
    public static final int xBoxChannel = 1;

    public static final int leftMotorChannel = 5;
    public static final int rightMotorChannel = 6;

    public static final XBoxController xBoxController = new XBoxController(xBoxChannel);
    public static final SpeedController leftMotor = new Victor(leftMotorChannel);
    public static final SpeedController rightMotor = new Victor(rightMotorChannel);
}
