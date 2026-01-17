package com.stuypulse.robot.commands.ClimbCommands;

import com.stuypulse.robot.subsystems.ClimbSubsystem.Climb.ClimbState;

public class ClimbUp extends SetState {
    public ClimbUp() {
        super(ClimbState.OPEN);
    }
}