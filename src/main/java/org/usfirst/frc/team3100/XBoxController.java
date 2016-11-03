package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.Joystick;

public class XBoxController extends Joystick{
    private static final int rightXAxis = 4;
    private static final int rightYAxis = 5;
    private static final int leftXAxis = 0;
    private static final int leftYAxis = 1;

    private static final int aButton = 1;
    private static final int bButton = 2;
    private static final int xButton = 3;
    private static final int yButton = 4;

    private static final int rightBumper = 5;
    private static final int leftBumper = 6;

    private static final int rightTrigger = 2;
    private static final int leftTrigger = 3;

    public XBoxController(int port) {
        super(port);
    }

    public double getRightStickX() {
        return getRawAxis(rightXAxis);
    }

    public double getRightStickY() {
        return getRawAxis(rightYAxis);
    }

    public double getLeftStickX() {
        return getRawAxis(leftXAxis);
    }

    public double getLeftStickY() {
        return getRawAxis(leftYAxis);
    }

    public boolean getButtonA() {
        return getRawButton(aButton);
    }

    public boolean getButtonB() {
        return getRawButton(bButton);
    }

    public boolean getButtonX() {
        return getRawButton(xButton);
    }

    public boolean getButtonY() {
        return getRawButton(yButton);
    }

    public boolean getRightBumper() {
        return getRawButton(rightBumper);
    }

    public boolean getLeftBumper() {
        return getRawButton(leftBumper);
    }

    public double getRightTrigger() {
        return getRawAxis(rightTrigger);
    }

    public double getLeftTrigger() {
        return getRawAxis(leftTrigger);
    }
}
