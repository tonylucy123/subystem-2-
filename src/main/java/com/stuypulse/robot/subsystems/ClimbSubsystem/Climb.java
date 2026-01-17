package com.stuypulse.robot.subsystems.ClimbSubsystem;

//import com.stuypulse.robot.constants.Settings;
//import com.stuypulse.robot.subsystems.ClimbSubsystem.ClimbImpl;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class Climb extends SubsystemBase {
     private static final Climb instance;

    static {
        instance = new ClimbImpl();
    }


    public static Climb getInstance() {
        return instance;
    }  
    
    private ClimbState state;

    public enum ClimbState {
        CLOSED(0),
        OPEN(180);
        
        private final double angle;
        private ClimbState(double angle) {
            this.angle = angle;
        }

        public double getAngle() {
            return this.angle;
        }
    }

    protected Climb () {
        this.state = ClimbState.CLOSED;
    }

    public ClimbState getState() {
        return this.state;
    }

    public void setState(ClimbState state) {
        this.state = state;
    }



}