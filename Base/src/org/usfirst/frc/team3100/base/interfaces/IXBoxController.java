package org.usfirst.frc.team3100.base.interfaces;

public interface IXBoxController {
	public double getRightStickX();
	public double getRightStickY();

	public double getLeftStickX();
	public double getLeftStickY();
	
	public boolean getButtonA();
	public boolean getButtonB();
	public boolean getButtonX();
	public boolean getButtonY();
	
	public boolean getRightBumper();
	public boolean getLeftBumper();
	
	public double getRightTrigger();
	public double getLeftTrigger();
}
