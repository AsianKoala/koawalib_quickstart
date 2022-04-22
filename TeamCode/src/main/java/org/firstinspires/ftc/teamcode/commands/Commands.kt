package org.firstinspires.ftc.teamcode.commands

import com.asiankoala.koawalib.command.commands.InstantCommand
import com.asiankoala.koawalib.command.commands.WaitUntilCommand
import com.asiankoala.koawalib.command.group.SequentialCommandGroup
import org.firstinspires.ftc.teamcode.subsystems.Arm
import org.firstinspires.ftc.teamcode.subsystems.Turret

object Commands {
    class TurretCommand(turret: Turret, angle: Double) : InstantCommand({turret.motor.followMotionProfile(angle)}, turret)
    class ArmCommand(arm: Arm, angle: Double) : InstantCommand({arm.motor.setPIDTarget(angle)}, arm)

    class ArmThenTurretSequence(turret: Turret, arm: Arm, turretAngle: Double, armAngle: Double) : SequentialCommandGroup(
            TurretCommand(turret, turretAngle),
            WaitUntilCommand(turret.motor::isAtTarget),
            ArmCommand(arm, armAngle),
            WaitUntilCommand(arm.motor::isAtTarget)
    )
}