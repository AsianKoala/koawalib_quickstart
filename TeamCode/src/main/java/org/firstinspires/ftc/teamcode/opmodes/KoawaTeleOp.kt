package org.firstinspires.ftc.teamcode.opmodes

import com.asiankoala.koawalib.command.CommandOpMode
import com.asiankoala.koawalib.command.commands.MecanumDriveCommand
import org.firstinspires.ftc.teamcode.Robot
import org.firstinspires.ftc.teamcode.commands.Commands

class KoawaTeleOp : CommandOpMode() {
    private val robot by lazy { Robot() }
    override fun mInit() {
        // todo: see https://asiankoala.github.io/koawalib/koawalib/com.asiankoala.koawalib.command.commands/-mecanum-drive-command/index.html
        robot.drive.setDefaultCommand(MecanumDriveCommand(
                robot.drive,
                driver.leftStick,
                driver.rightStick.xInverted.yInverted,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
        ))

        // todo: bind commands here
        driver.rightTrigger.onPress(Commands.TurretCommand(robot.turret, 45.0))
        driver.leftTrigger.onPress(Commands.ArmCommand(robot.arm, 0.0))
        driver.rightBumper.onPress(Commands.ArmThenTurretSequence(robot.turret, robot.arm, 180.0, 130.0))
    }

    // todo: if needed, override mInitLoop(), mStart(), mLoop()
}