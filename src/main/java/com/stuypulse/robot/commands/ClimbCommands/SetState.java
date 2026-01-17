package com.stuypulse.robot.commands.ClimbCommands;

import edu.wpi.first.wpilibj2.command.Command;
import com.stuypulse.robot.subsystems.ClimbSubsystem.Climb;
import com.stuypulse.robot.subsystems.ClimbSubsystem.Climb.ClimbState;

public class SetState extends Command {
    private final ClimbState state;

    private final Climb climb;
    
    public SetState(ClimbState state) {
        this.state = state;
        this.climb = Climb.getInstance();
    
        addRequirements(climb);
    }

    @Override
    public void initialize() {
        this.climb.setState(this.state);
    }

}