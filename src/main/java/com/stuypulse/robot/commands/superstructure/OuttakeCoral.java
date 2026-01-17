package com.stuypulse.robot.commands.superstructure;

import com.stuypulse.robot.subsystems.superstructure.Superstructure.SuperstructureState;

public class OuttakeCoral extends SetState {
    public OuttakeCoral() {
        super(SuperstructureState.OUTTAKING_CORAL);
    }
}