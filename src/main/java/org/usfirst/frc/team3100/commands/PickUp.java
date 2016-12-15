package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class PickUp extends Command {
    public PickUp() {
        super("PickUp");
        requires(Robot.pickUp);
        setTimeout(2);
    }

    public void initialize() {
        Robot.pickUp.pickUp();
    }

    public void execute() {

    }

    public boolean isFinished() {
        return isTimedOut();
    }

    public void end() {
        Robot.pickUp.stopPickingUp();
    }

    public void interrupted() {
        end();
    }
}
