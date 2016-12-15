package org.usfirst.frc.team3100.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Aim;

public class Turret extends Subsystem {

    private SpeedController turntableMotor = RobotMap.turntableMotor;
    private SpeedController hoodMotor = RobotMap.hoodMotor;

    public void initDefaultCommand() {
        setDefaultCommand(new Aim());
    }

    public void rotateRight() {
        turntableMotor.set(1);
    }

    public void rotateLeft() {
        turntableMotor.set(-1);
    }

    public void liftUp() {
        hoodMotor.set(1);
    }

    public void liftDown() {
        hoodMotor.set(-1);
    }

    public void stopRotating() {
        turntableMotor.set(0);
    }

    public void stopLifting() {
        hoodMotor.set(0);
    }
}
