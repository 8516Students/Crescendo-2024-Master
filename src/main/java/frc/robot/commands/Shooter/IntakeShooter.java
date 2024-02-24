// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Shooter;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShootNote;

public class IntakeShooter extends Command {
  private final ShootNote m_NoteTransfer;

  /** Creates a new IntakeShooter. */
  public IntakeShooter(ShootNote mShootNote) {
    m_NoteTransfer = mShootNote;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_NoteTransfer);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_NoteTransfer.TransferNoteToShooter();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_NoteTransfer.StopShooterMotion();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
