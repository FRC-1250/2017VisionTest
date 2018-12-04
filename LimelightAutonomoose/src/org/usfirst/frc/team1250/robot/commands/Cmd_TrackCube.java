package org.usfirst.frc.team1250.robot.commands;

import org.usfirst.frc.team1250.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Cmd_TrackCube extends Command {

	
	private double xCube;
	private double aCube;
	
    public Cmd_TrackCube() {
        requires(Robot.s_drivetrain);
        requires(Robot.s_limelight);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	xCube = Robot.s_limelight.getCubeX();
		aCube = Robot.s_limelight.getCubeArea();
		
		Robot.s_drivetrain.trackCube(xCube, aCube);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.s_drivetrain.isAtCubeSP(aCube);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.s_drivetrain.driveStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
