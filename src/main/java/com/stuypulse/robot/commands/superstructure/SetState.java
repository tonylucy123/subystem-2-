package com.stuypulse.robot.commands.superstructure;

import edu.wpi.first.wpilibj2.command.Command;
import com.stuypulse.robot.subsystems.superstructure.Superstructure;
import com.stuypulse.robot.subsystems.superstructure.Superstructure.SuperstructureState;

 public class SetState extends Command {
    private final SuperstructureState state;
    private final Superstructure superstructure;
    
    public SetState(SuperstructureState state) {
        this.state = state;
        this.superstructure = Superstructure.getInstance();
    }

    @Override
    public void initialize() {
        this.superstructure.setState(this.state);
    }
} 