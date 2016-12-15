package org.usfirst.frc.team3100.subsystems;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3100.RobotMap;

public class Shooter extends Subsystem {

    private SpeedController shooterMotor = RobotMap.shooterMotor;
    private SpeedController liftMotor = RobotMap.liftMotor;

    public void initDefaultCommand() {

    }

    public void shoot() {
        shooterMotor.set(1);
        liftMotor.set(1);
    }

    public void stopShooting() {
        shooterMotor.set(0);
        liftMotor.set(0);
    }
}
