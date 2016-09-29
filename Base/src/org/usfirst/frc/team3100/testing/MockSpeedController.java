package org.usfirst.frc.team3100.testing;

import edu.wpi.first.wpilibj.SpeedController;

public class MockSpeedController implements SpeedController {
	public boolean isInverted;
	public double speed;
	public byte syncGroup;
	public double pid;

	public MockSpeedController() {
		isInverted = false;
		speed = 0;
		syncGroup = 0;
		pid = 0;
	}

	@Override
	public void pidWrite(double output) {
		pid = output;
	}

	@Override
	public double get() {
		return speed;
	}

	@Override
	public void set(double speed, byte syncGroup) {
		this.speed = speed;
		this.syncGroup = syncGroup;
	}

	@Override
	public void set(double speed) {
		this.speed = speed;
	}

	@Override
	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}

	@Override
	public boolean getInverted() {
		return this.isInverted;
	}

	@Override
	public void disable() {
		speed = 0;
	}

	@Override
	public void stopMotor() {
		disable();
	}

}
