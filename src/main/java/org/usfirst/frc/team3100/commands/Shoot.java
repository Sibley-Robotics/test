package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class Shoot extends Command{
    public Shoot() {
        super("Shoot");
        requires(Robot.shooter);
    }

    public void initialize() {
        Robot.shooter.shoot();
    }

    public void execute() {

    }

    public boolean isFinished() {
        return Robot.oi.shooting();
    }

    public void end() {
        Robot.shooter.stopShooting();
    }

    public void interrupted() {
        end();
    }
}
