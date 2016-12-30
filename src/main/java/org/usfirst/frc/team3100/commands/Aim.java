package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class Aim extends Command {
    public Aim() {
        super("Aim");
        requires(Robot.turret);
    }

    public void initialize() {

    }

    public void execute() {
        int rotate = Robot.oi.getTurretRotateDirection();
        int lift = Robot.oi.getTurretLiftDirection();

        if (rotate == 1)
            Robot.turret.rotateRight();
        else if (rotate == -1)
            Robot.turret.rotateLeft();
        else
            Robot.turret.stopRotating();

        if (lift == 1)
            Robot.turret.liftUp();
        else if (lift == -1)
            Robot.turret.liftDown();
        else
            Robot.turret.stopLifting();
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
    }

    public void interrupted() {
        Robot.turret.stopRotating();
        Robot.turret.stopLifting();
    }
}
