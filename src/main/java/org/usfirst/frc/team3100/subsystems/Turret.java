package org.usfirst.frc.team3100.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Drive;

public class Turret extends Subsystem {

    private SpeedController turntableMotor = RobotMap.turntableMotor;
    private SpeedController hoodMotor = RobotMap.hoodMotor;
    private SpeedController shooterMotor = RobotMap.shooterMotor;

    public void initDefaultCommand() {

    }

    public void aimRight() {
        turntableMotor.set(1);
    }

    public void aimLeft() {
        turntableMotor.set(-1);
    }

    public void aimUp() {
        hoodMotor.set(1);
    }

    public void aimDown() {
        hoodMotor.set(-1);
    }

    public void shoot() {
        shooterMotor.set(1);
    }

    public void stop () {
        hoodMotor.set(0);
        turntableMotor.set(0);
        shooterMotor.set(0);
    }
}
