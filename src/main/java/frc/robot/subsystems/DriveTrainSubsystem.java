/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrainSubsystem extends Subsystem {
  private TalonSRX leftMotor;
  private TalonSRX rightMotor;

  public DriveTrainSubsystem(){
      leftMotor =  new TalonSRX(RobotMap.leftMotorID);
      rightMotor =  new TalonSRX(RobotMap.rightMotorID);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void drive(double leftSpeed, double rightSpeed){
      leftMotor.set(ControlMode.PercentOutput, -leftSpeed);
      rightMotor.set(ControlMode.PercentOutput, rightSpeed);
  }
}

