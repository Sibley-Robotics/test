package org.usfirst.frc.team3100.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Drive;


public class MainDrive extends Subsystem {

    SpeedController leftMotor = RobotMap.leftMotor;
    SpeedController rightMotor = RobotMap.rightMotor;
    RobotDrive mainDrive = new RobotDrive(leftMotor, rightMotor);

    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    public void drive(double move, double rotate) {
        SmartDashboard.putString("Drive", move + ", " + rotate);
        mainDrive.arcadeDrive(move, rotate);
    }
}
