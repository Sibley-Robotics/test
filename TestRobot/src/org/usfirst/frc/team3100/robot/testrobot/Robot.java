
package org.usfirst.frc.team3100.robot.testrobot;

import org.usfirst.frc.team3100.base.inputs.XBoxController;
import org.usfirst.frc.team3100.base.interfaces.IXBoxController;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive;

public class Robot extends IterativeRobot {
	private static final int controllerPort = 1;
	private static final int leftDriveChannel = 5;
	private static final int rightDriveChannel = 6;

	private IXBoxController controller;
	
	private SpeedController rightDrive;
	private SpeedController leftDrive;

	private RobotDrive driveTrain;
	
	private RobotBase robot;

    public void robotInit() {
    	controller = new XBoxController(controllerPort);
    	rightDrive = new Victor(rightDriveChannel);
    	leftDrive = new Victor(leftDriveChannel);
    	
		driveTrain = new RobotDrive(leftDrive, rightDrive);
    	robot = new RobotBase(controller, rightDrive, leftDrive);
    }
    
    public void autonomousInit() {

    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
    	driveTrain.arcadeDrive(controller.getLeftStickY(), controller.getRightStickY());
    }
    
    public void testPeriodic() {
    	robot.dummymethod();
    }
    
}
