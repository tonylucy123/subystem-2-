package com.stuypulse.robot.subsystems.superstructure;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import com.stuypulse.robot.constants.Settings;

public class Superstructure extends SubsystemBase {
    public static final Superstructure instance;

    static {
        instance = new SuperstructureImpl();
    }

    public static Superstructure getInstance() {
        return instance;
    }

    public enum SuperstructureState {
        IDLE(0, 0),
        INTAKING_ALGAE(1, 1),
        OUTTAKING_ALGAE(-1, 1),
        OUTTAKING_CORAL(-1, 1);

        private double armPos;
        private double intakeSpeed;

        private SuperstructureState(double armPos, double intakeSpeed) {
            this.armPos = armPos;
            this.intakeSpeed = intakeSpeed;
        }

        public double getArmPos() {
            return this.armPos;
        }
        
        public double getIntakeSpeed() {
            return this.intakeSpeed;
        }
    }

    public SuperstructureState state;

    protected Superstructure() {
        this.state = SuperstructureState.IDLE;
    }

    public SuperstructureState getState() {
        return this.state;
    }

    public void setState(SuperstructureState state) {
        this.state = state;
    }
} 