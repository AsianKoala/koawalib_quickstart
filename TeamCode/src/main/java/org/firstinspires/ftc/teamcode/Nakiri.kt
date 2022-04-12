package org.firstinspires.ftc.teamcode

import com.asiankoala.koawalib.control.MotorControlType
import com.asiankoala.koawalib.hardware.motor.KMotor
import com.asiankoala.koawalib.hardware.motor.KMotorEx
import com.asiankoala.koawalib.hardware.motor.KMotorExConfig
import com.asiankoala.koawalib.subsystem.drive.KMecanumDrive
import org.firstinspires.ftc.teamcode.subsystems.Slides
import org.firstinspires.ftc.teamcode.subsystems.Turret

class Nakiri {
    private val fl = KMotor("fl")
    private val bl = KMotor("bl")
    private val br = KMotor("br")
    private val fr = KMotor("fr")

    private val turretMotor = KMotorEx(
        KMotorExConfig(
            "turret",
            10.0,
            false,
            MotorControlType.MOTION_PROFILE,
            positionEpsilon = 2.0
        )
    )

    private val slidesMotor = KMotorEx(
        KMotorExConfig(
            "slides",
            15.0,
            false,
            MotorControlType.MOTION_PROFILE,
            positionEpsilon = 1.0
        )
    )

    val drive = KMecanumDrive(fl, bl, br, fr)
    val turret = Turret(turretMotor)
    val slides = Slides(slidesMotor)
}