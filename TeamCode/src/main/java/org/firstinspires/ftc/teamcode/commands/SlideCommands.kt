package org.firstinspires.ftc.teamcode.commands

import com.asiankoala.koawalib.command.commands.InstantCommand
import org.firstinspires.ftc.teamcode.subsystems.Slides

class SlideCommands {
    class SlideSetInchesCommand(inches: Double, slides: Slides) : InstantCommand({slides.motor.followMotionProfile(inches)}, slides)
}