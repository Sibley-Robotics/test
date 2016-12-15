package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class Shoot extends Command{
    public Shoot() {
        super("Shoot");
        requires(Robot.shooter);
        setTimeout(2);
    }

    public void initialize() {
        Robot.shooter.shoot();
    }

    public void execute() {

    }

    public boolean isFinished() {
        return isTimedOut();
    }

    public void end() {
        Robot.shooter.stopShooting();
    }

    public void interrupted() {
        end();
    }
}
