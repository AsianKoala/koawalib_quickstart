package org.firstinspires.ftc.teamcode.opmodes

import com.asiankoala.koawalib.command.CommandOpMode
import com.asiankoala.koawalib.command.commands.MecanumDriveCommand
import org.firstinspires.ftc.teamcode.Nakiri
import org.firstinspires.ftc.teamcode.commands.SlideCommands
import org.firstinspires.ftc.teamcode.commands.TurretCommands

class NakiriTeleOp : CommandOpMode() {
    private lateinit var nakiri: Nakiri

    override fun mInit() {
        nakiri = Nakiri()

        nakiri.drive.setDefaultCommand(MecanumDriveCommand(
            nakiri.drive,
            driver.leftStick,
            driver.rightStick
        ))

        driver.leftBumper.onPress(TurretCommands.TurretSetAngleCommand(180.0, nakiri.turret))
        driver.rightBumper.onPress(SlideCommands.SlideSetInchesCommand(10.0, nakiri.slides))
    }
}