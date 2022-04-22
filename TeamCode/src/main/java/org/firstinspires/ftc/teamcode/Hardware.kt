package org.firstinspires.ftc.teamcode

import com.asiankoala.koawalib.control.FeedforwardConstants
import com.asiankoala.koawalib.control.MotorControlType
import com.asiankoala.koawalib.control.PIDConstants
import com.asiankoala.koawalib.hardware.motor.KMotor
import com.asiankoala.koawalib.hardware.motor.KMotorEx
import com.asiankoala.koawalib.hardware.motor.KMotorExConfig
import kotlin.math.PI

// todo: add any hardware devices here (motors, servos, sensors, etc)
class Hardware {
    // todo: enter drive motors here, if necessary, use .reverse, .forward, .brake, .float to set the motor settings. default is float and forward
    val fl = KMotor(TODO("enter name here")).brake
    val bl = KMotor(TODO("enter name here")).brake
    val br = KMotor(TODO("enter name here")).brake.reverse
    val fr = KMotor(TODO("enter name here")).brake.reverse

    // todo: add MotorEx for subsystems with PID control or if motion profiled
    // example: turret and arm
    val turret = KMotorEx(
            // see for defaults: https://asiankoala.github.io/koawalib/koawalib/com.asiankoala.koawalib.hardware.motor/-k-motor-ex-config/index.html
            KMotorExConfig(
                    "turret", // hardwareMap name
                    10.0, // ticks per unit (to find empirically, move your subsystem x units and record ticks. ticksPerUnit = ticks recorded / units moved)
                    false, // is encoder a rev through bore?
                    MotorControlType.MOTION_PROFILE, // open loop, position pid, or motion profile
                    PIDConstants(3.0, 2.0, 1.0), // standard pid constants
                    FeedforwardConstants(kStatic = 0.5), // see https://asiankoala.github.io/koawalib/koawalib/com.asiankoala.koawalib.control/-feedforward-constants/index.html
                    positionEpsilon = 2.0, // acceptable error (when distance to target < this, subsystem has achieved target position)
                    lowerBound = -PI, // lower bound of input (used for pid controller to take the most optimal path)
                    upperBound = PI, // upper bound
                    maxVelocity = 120.0, // max velocity in units/s
                    maxAcceleration = 120.0 // max accel in units/s^2
            )
    )

    // create motor can be used too
    val arm = KMotorEx.createMotor(
            "arm",
            20.0,
            false,
            MotorControlType.POSITION_PID,
            PIDConstants(),
            FeedforwardConstants(),
            1.0
    )
}