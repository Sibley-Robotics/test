package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.XBoxController;

public class OI {
    XBoxController controller = RobotMap.xBoxController;

    public OI() {
    }

    public double getMoveSpeed() {
        return controller.getLeftStickY();
    }

    public double getRotateSpeed() {
        return controller.getRightStickX();
    }
}
