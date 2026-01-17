package com.stuypulse.robot.subsystems.superstructure;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.stuypulse.robot.constants.Settings;

public class Superstructure extends SubsystemBase {
    public static final Superstructure instance;

    static {
            instance = new SuperstructureImpl();
    }

    public static Superstructure getInstance() {
        return instance;
    }

    public enum SuperstructureState {
        INTAKING_ALGAE(Settings.Superstructure.Intake_Speeds.ALGAE_INTAKE_SPEED),
        OUTTAKING_ALGAE(Settings.Superstructure.Intake_Speeds.ALGAE_OUTTAKE_SPEED),
        OUTTAKING_CORAL(Settings.Superstructure.Intake_Speeds.CORAL_OUTTAKE_SPEED);

        private do
    }
} 