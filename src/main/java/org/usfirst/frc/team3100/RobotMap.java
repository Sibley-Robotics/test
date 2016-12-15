package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.*;

public class RobotMap {
    public static final int xBoxPort = 1;

    public static final int leftMotorChannel = 5;
    public static final int rightMotorChannel = 6;
    public static final int turntableChannel = 3;
    public static final int hoodChannel = 0;
    public static final int shooterChannel = 1;
    public static final int liftChannel = 2;

    public static final XBoxController xBoxController = new XBoxController(xBoxPort);
    public static final SpeedController leftMotor = new Victor(leftMotorChannel);
    public static final SpeedController rightMotor = new Victor(rightMotorChannel);
    public static final SpeedController turntableMotor = new Victor(turntableChannel);
    public static final SpeedController hoodMotor = new Victor(hoodChannel);
    public static final SpeedController shooterMotor = new Victor(shooterChannel);
    public static final SpeedController liftMotor = new Victor(liftChannel);
}
