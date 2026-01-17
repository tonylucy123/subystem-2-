package com.stuypulse.robot.commands.superstructure;

import com.stuypulse.robot.subsystems.superstructure.Superstructure.SuperstructureState;

public class IntakeAlgae extends SetState {
    public IntakeAlgae() {
        super(SuperstructureState.INTAKING_ALGAE);
    }
}