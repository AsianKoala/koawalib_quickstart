package org.firstinspires.ftc.teamcode

import com.asiankoala.koawalib.subsystem.drive.KMecanumDrive
import org.firstinspires.ftc.teamcode.subsystems.Arm
import org.firstinspires.ftc.teamcode.subsystems.Turret

// todo: create subsystems in this class from hardware
// todo: set subsystems with a KMotorEx to a target position
class Robot {
    val hardware = Hardware()

    val drive = KMecanumDrive(hardware.fl, hardware.bl, hardware.br, hardware.fr)
    val turret = Turret(hardware.turret)
    val arm = Arm(hardware.arm)

    init {
        turret.motor.followMotionProfile(0.0)
        arm.motor.setPIDTarget(0.0)
    }
}