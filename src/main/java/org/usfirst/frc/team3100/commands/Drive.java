package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class Drive extends Command{

    public Drive() {
        requires(Robot.drive);
    }

    public void initialize() {

    }

    public void execute() {
        Robot.drive.drive(Robot.oi.getMoveSpeed(), Robot.oi.getRotateSpeed());
    }

    public boolean isFinished() {
        return false;
    }

    public void end () {

    }

    public void interrupted() {

    }

}
