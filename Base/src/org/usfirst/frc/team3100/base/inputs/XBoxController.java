package org.usfirst.frc.team3100.base.inputs;

import org.usfirst.frc.team3100.base.interfaces.IXBoxController;

import edu.wpi.first.wpilibj.Joystick;

public class XBoxController extends Joystick implements IXBoxController {
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

	@Override
	public double getRightStickX() {
		return getRawAxis(rightXAxis);
	}
	@Override
	public double getRightStickY() {
		return getRawAxis(rightYAxis);
	}
	@Override
	public double getLeftStickX() {
		return getRawAxis(leftXAxis);
	}
	@Override
	public double getLeftStickY() {
		return getRawAxis(leftYAxis);
	}

	@Override
	public boolean getButtonA() {
		return getRawButton(aButton);
	}
	@Override
	public boolean getButtonB() {
		return getRawButton(bButton);
	}
	@Override
	public boolean getButtonX() {
		return getRawButton(xButton);
	}
	@Override
	public boolean getButtonY() {
		return getRawButton(yButton);
	}

	@Override
	public boolean getRightBumper() {
		return getRawButton(rightBumper);
	}
	@Override
	public boolean getLeftBumper() {
		return getRawButton(leftBumper);
	}

	@Override
	public double getRightTrigger() {
		return getRawAxis(rightTrigger);
	}
	@Override
	public double getLeftTrigger() {
		return getRawAxis(leftTrigger);
	}
}
