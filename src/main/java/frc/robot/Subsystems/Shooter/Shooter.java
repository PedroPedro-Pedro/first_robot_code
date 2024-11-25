// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems.Shooter;
import edu.wpi.first.wpilibj.DigitalInput;
// import com.ctre.pheonix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;


public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private TalonFX motor;
  private DigitalInput frontIr;
  
  public Shooter() {
    motor = new TalonFX(PortMap.Shooter.Shooter_Left_ID);
    frontIr = new DigitalInput(PortMap.Shooter.Shooter_IR_DIO);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
