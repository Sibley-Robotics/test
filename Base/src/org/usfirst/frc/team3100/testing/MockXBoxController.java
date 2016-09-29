package org.usfirst.frc.team3100.testing;

import org.usfirst.frc.team3100.base.interfaces.IXBoxController;

public class MockXBoxController implements IXBoxController {
	public double rightStickX;
	public double rightStickY;
	public double leftStickX;
	public double leftStickY;
	
	public boolean aButton;
	public boolean bButton;
	public boolean xButton;
	public boolean yButton;
	
	public boolean rightBumper;
	public boolean leftBumper;
	
	public double rightTrigger;
	public double leftTrigger;
	
	public MockXBoxController() {
		rightStickX = 0;
		rightStickY = 0;
		leftStickX = 0;
		leftStickY = 0;
		
		aButton = false;
		bButton = false;
		xButton = false;
		yButton = false;
		
		rightBumper = false; 
		leftBumper = false; 
		
		rightTrigger = 0;
		leftTrigger = 0;
	}


	@Override
	public double getRightStickX() {
		return rightStickX;
	}

	@Override
	public double getRightStickY() {
		return rightStickY;
	}

	@Override
	public double getLeftStickX() {
		return leftStickX;
	}

	@Override
	public double getLeftStickY() {
		return leftStickY;
	}

	@Override
	public boolean getButtonA() {
		return aButton;
	}

	@Override
	public boolean getButtonB() {
		return bButton;
	}

	@Override
	public boolean getButtonX() {
		return xButton;
	}

	@Override
	public boolean getButtonY() {
		return yButton;
	}

	@Override
	public boolean getRightBumper() {
		return rightBumper;
	}

	@Override
	public boolean getLeftBumper() {
		return leftBumper;
	}

	@Override
	public double getRightTrigger() {
		return rightTrigger;
	}

	@Override
	public double getLeftTrigger() {
		return leftTrigger;
	}

}
