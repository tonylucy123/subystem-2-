/*********************** PROJECT PHIL ************************/
/* Copyright (c) 2024 StuyPulse Robotics. All rights reserved.*/
/* This work is licensed under the terms of the MIT license.  */
/**************************************************************/

package com.stuypulse.robot.constants;

import com.stuypulse.stuylib.network.SmartBoolean;
import com.stuypulse.stuylib.network.SmartNumber;

/*-
 * File containing tunable settings for every subsystem on the robot.
 *
 * We use StuyLib's SmartNumber / SmartBoolean in order to have tunable
 * values that we can edit on Shuffleboard.
 */
public interface Settings {
    interface Superstructure {
        public interface Intake_Speeds {
            double ALGAE_INTAKE_SPEED = 1;
            double ALGAE_OUTTAKE_SPEED = -1;
            double CORAL_OUTTAKE_SPEED = -1;
        }
    }
}