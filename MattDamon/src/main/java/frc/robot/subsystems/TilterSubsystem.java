/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.TilterCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
/**
 * Add your docs here.
 */
public class TilterSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  TalonSRX tilterMotor;
  TalonSRX greenWheelMotor;
  DigitalInput switch1;
  DigitalInput switch2;
  public TilterSubsystem() {
    tilterMotor = new TalonSRX(RobotMap.tilterMotorID);
    greenWheelMotor = new TalonSRX(RobotMap.greenWheelMotorID);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new TilterCommand());
  }

  public void tilt(){
    double rightY = OI.operatorController.getY(Hand.kRight);
    tilterMotor.set(ControlMode.PercentOutput, rightY);
   /* if(switch2.get()){
      if(!switch1.get()){
        greenWheelMotor.set(ControlMode.PercentOutput, 0.5);
      } 
    }*/
  }
}
