// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrainSubsystem extends SubsystemBase {

  private final CANSparkMax m;
  //private final CANSparkMax m_fr; 
  //private final CANSparkMax m_bl;
  //private final CANSparkMax m_br;
  //private final SpeedControllerGroup right;
  private final SpeedControllerGroup l;
  //private final DifferentialDrive DriveTrain;
  // Declare motor controller

  /** Creates a new DriveTrainSubsystem. */
  public DriveTrainSubsystem() {

    m=new CANSparkMax(Constants.m_port, MotorType.kBrushed);
    // m_fr=new CANSparkMax(Constants.fr_port, MotorType.kBrushed);
    //m_bl=new CANSparkMax(Constants.bl_port, MotorType.kBrushed);
    // m_br=new CANSparkMax(Constants.br_port, MotorType.kBrushed);

    l = new SpeedControllerGroup(m);
    //right = new SpeedControllerGroup(m_fr, m_br);
    //DriveTrain = new DifferentialDrive(l);

    System.out.println("Hello");
    //Initialise motor controller here

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // run something once per 20 milliseconds while subsystem is active

    
  }

    public void arcadeInBuilt (double y, double z){
      m.setInverted(false);
      //m_fr.setInverted(false);
      //DriveTrain.arcadeDrive(y*Constants.maxSpeed, z*Constants.maxSpeed);

    }

    public void drive (double l, double r){
      /*m_br.setInverted(true);
      m_fr.setInverted(true);

      m_br.set(r);
      m_fr.set(r);
      m_fl.set(l);*/
      m.set(l);
      

    }
  // move() - create functions

}