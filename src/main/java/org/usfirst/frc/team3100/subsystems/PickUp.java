package org.usfirst.frc.team3100.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3100.RobotMap;

public class PickUp extends Subsystem {

    private SpeedController pickUpMotor = RobotMap.pickUpMotor;

    public void initDefaultCommand() {

    }

    public void pickUp() {
        pickUpMotor.set(1);
    }

    public void stopPickingUp() {
        pickUpMotor.set(0);
    }
}
