package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

    public static MainDrive drive;
    public static OI oi;

    public void robotInit() {
        drive = new MainDrive();
        oi = new OI();

        SmartDashboard.putData("Main Drive", drive);
    }

    public void autonomousInit() {
    }

    public void autonomousPeriodic() {
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
    }
}
