/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1250.robot;

import org.usfirst.frc.team1250.robot.commands.Cmd_AutoTurn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick Gamepad = new Joystick(0);
	Joystick Arcadepad = new Joystick(1);
	
	JoystickButton rt = new JoystickButton(Gamepad, 8);
	
	public OI() {
		rt.whenPressed(new Cmd_AutoTurn(90, 0.8, 0.6));
	}
	
	
	
	
	
	
	public boolean getButtonState(int btn) {
		return Gamepad.getRawButton(btn);
	}

	public Joystick getGamepad() {
		return Gamepad;
	}
	

	public Joystick getArcadepad() {
		return Arcadepad;
	}
	}


