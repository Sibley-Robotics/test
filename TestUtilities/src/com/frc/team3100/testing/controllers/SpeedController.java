package com.frc.team3100.testing.controllers;



public class SpeedController implements edu.wpi.first.wpilibj.SpeedController {
	public double speed;

	@Override
	public void pidWrite(double arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub

	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getInverted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void set(double arg0) {
		// TODO Auto-generated method stub
		speed = arg0;
	}

	@Override
	public void set(double arg0, byte arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInverted(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopMotor() {
		// TODO Auto-generated method stub

	}

}
