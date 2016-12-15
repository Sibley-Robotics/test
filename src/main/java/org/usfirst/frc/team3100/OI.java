package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.commands.Shoot;

public class OI {
    private XBoxController controller = RobotMap.xBoxController;

    private Button shootButton = new JoystickButton(controller, XBoxController.aButton);

    public OI() {
        shootButton.whenPressed(new Shoot());
    }

    public double getDriveMoveSpeed() {
        return controller.getLeftStickY();
    }

    public double getRotateSpeed() {
        return controller.getRightStickX();
    }

    public int getTurretRotateDirection() {
        int angle = controller.getDPad();
        if (angle == 90)
            return 1;
        else if (angle == 270)
            return -1;
        else
            return 0;
    }

    public int getTurretLiftDirection() {
        int angle = controller.getDPad();
        if (angle == 180)
            return 1;
        else if (angle == 0)
            return -1;
        else
            return 0;
    }

    public boolean shooting() {
        return controller.getButtonA();
    }
}
