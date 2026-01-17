package com.stuypulse.robot.commands.superstructure;

import com.stuypulse.robot.subsystems.superstructure.Superstructure.SuperstructureState;

public class OuttakeAlgae extends SetState {
    public OuttakeAlgae() {
        super(SuperstructureState.OUTTAKING_ALGAE);
    }
}