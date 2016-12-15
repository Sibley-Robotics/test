package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class PickUp extends Command {
    public PickUp() {
        super("PickUp");
        requires(Robot.pickUp);
    }

    public void initialize() {
        Robot.pickUp.pickUp();
    }

    public void execute() {

    }

    public boolean isFinished() {
        return Robot.oi.pickingUp();
    }

    public void end() {
        Robot.pickUp.stopPickingUp();
    }

    public void interrupted() {
        end();
    }
}
