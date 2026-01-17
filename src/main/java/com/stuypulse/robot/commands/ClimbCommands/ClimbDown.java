package com.stuypulse.robot.commands.ClimbCommands;

import com.stuypulse.robot.subsystems.ClimbSubsystem.Climb.ClimbState;

public class ClimbDown extends SetState {
    public ClimbDown() {
        super(ClimbState.CLOSED);
    }
}