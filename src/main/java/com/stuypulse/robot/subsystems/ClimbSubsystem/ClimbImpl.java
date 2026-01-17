package com.stuypulse.robot.subsystems.ClimbSubsystem;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.stuypulse.robot.constants.Ports.Climber;
import com.stuypulse.robot.constants.Motors.NeoConfig;
import com.stuypulse.robot.constants.Settings;

public  class ClimbImpl extends Climb {
    private final SparkMax climbMotor;
    private final RelativeEncoder relativeEncoder;

    protected ClimbImpl() {
        super();
        // intialize relative encoder and motor
        climbMotor = new SparkMax(Climber.CLIMB_MOTOR, MotorType.kBrushless);
        relativeEncoder = climbMotor.getEncoder();
        new NeoConfig().configure(climbMotor);

    }
    // SubSystemBase Link
    // https://docs.wpilib.org/en/stable/docs/software/commandbased/subsystems.html
    
    public double getClimbPosition() {
        return relativeEncoder.getPosition();
    }

    @Override
    public void periodic() {
        double currentAngle = relativeEncoder.getPosition();
        double desiredAngle = getState().getAngle();
        if (Math.abs(currentAngle - desiredAngle) > Settings.Climb.TOLERANCE) {
            if (currentAngle < desiredAngle) {
                climbMotor.setVoltage(Settings.Climb.CLIMB_VOLTAGE);
            }
            if (currentAngle > desiredAngle) {
                climbMotor.setVoltage(-Settings.Climb.CLIMB_VOLTAGE);
            }
        } else climbMotor.setVoltage(0);
        // System.out.println("ആറ് ഏഴ്"); 
        // climbMotor.setVoltage(Settings.Climb.CLIMB_VOLTAGE); // use this for setting voltage
    }
}