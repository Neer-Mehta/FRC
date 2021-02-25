// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj.Joystick;

public class DriveCommand extends CommandBase {

  DriveTrainSubsystem driveTrainSubsystem;
  
  /** Creates a new DriveCommand. */
  public DriveCommand(DriveTrainSubsystem drive) {

    driveTrainSubsystem = drive;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    //runs when command is started
  }

  // Called every time the scheduler runs while the command is scheduled.


  @Override
  public void execute() {

    //double y_axis = RobotContainer.joy1.getY();
    //double z_axis = RobotContainer.joy1.getZ();
    //driveTrainSubsystem.arcadeInBuilt(y_axis, z_axis);
    

    // every 20 ms while command is active
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    //runs once command ends - called when isFinished returns true
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    //returns true if the command is finished, false if not
  }
}