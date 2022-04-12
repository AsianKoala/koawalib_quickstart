package org.firstinspires.ftc.teamcode.commands

import com.asiankoala.koawalib.command.commands.InstantCommand
import org.firstinspires.ftc.teamcode.subsystems.Turret

class TurretCommands {
    class TurretSetAngleCommand(angle: Double, turret: Turret) : InstantCommand({turret.motor.followMotionProfile(angle)}, turret)
}