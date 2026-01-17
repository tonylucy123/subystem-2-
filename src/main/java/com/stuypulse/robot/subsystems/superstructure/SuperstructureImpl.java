package com.stuypulse.robot.subsystems.superstructure;

import com.ctre.phoenix6.hardware.TalonFX;
import com.stuypulse.robot.constants.Ports;
import com.stuypulse.robot.constants.Settings.SuperstructureInterface;
import com.stuypulse.robot.constants.Motors.TalonFXConfig;
import com.ctre.phoenix6.controls.MotionMagicVoltage;

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

    @Override
    public void periodic() {
        System.out.println("ആറ് ഏഴ്");
        
        double armDiff = Math.abs(armMotor.getPosition().getValueAsDouble() - getState().getArmPos());
        double tolerance = SuperstructureInterface.Arm_Angles.TOLERANCE_DEGREES;

        if (armDiff > tolerance) {
            armMotor.setControl(new MotionMagicVoltage(getState().getArmPos()));
        }
        intakeMotor.set(getState().getIntakeSpeed());
    }
}