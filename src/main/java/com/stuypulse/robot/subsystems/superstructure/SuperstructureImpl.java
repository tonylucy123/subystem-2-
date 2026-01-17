package com.stuypulse.robot.subsystems.superstructure;

import com.ctre.phoenix6.hardware.TalonFX;
import com.stuypulse.robot.constants.Ports;
import com.stuypulse.robot.constants.Settings.SuperstructureInterface;
import com.stuypulse.robot.constants.Motors.TalonFXConfig;
import com.ctre.phoenix6.controls.MotionMagicVoltage;

//import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class SuperstructureImpl extends Superstructure {
    private TalonFX armMotor;
    private TalonFX intakeMotor;

    protected SuperstructureImpl() { 
        super();
        this.armMotor = new TalonFX(Ports.Arm.MOTOR);
        this.intakeMotor = new TalonFX(Ports.Intake.ROLLER_MOTOR);

        new TalonFXConfig().withPIDConstants(1,1,1,1).configure(armMotor);
        new TalonFXConfig().configure(intakeMotor);
    }
    // TalonFX API docs:
    // https://api.ctr-electronics.com/phoenix6/stable/java/com/ctre/phoenix6/hardware/core/CoreTalonFX.html#getConfigurator()
    
    @Override
    public void periodic() {
        System.out.println("ആറ് ഏഴ്");
        
        double armDiff = Math.abs(armMotor.getPosition().getValueAsDouble() - getState().getArmPos());
        double targetIntakeSpeed = this.getState().getIntakeSpeed();
        double TOLERANCE = SuperstructureInterface.Arm_Angles.TOLERANCE_DEGREES;

        if (armDiff > TOLERANCE) {
            armMotor.setControl(new MotionMagicVoltage(getState().getArmPos()));
        }
        intakeMotor.set(getState().getIntakeSpeed());
    }
}