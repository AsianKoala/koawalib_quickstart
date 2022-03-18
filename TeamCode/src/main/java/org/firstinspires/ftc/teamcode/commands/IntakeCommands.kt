package org.firstinspires.ftc.teamcode.commands

import com.asiankoala.koawalib.command.commands.InstantCommand
import org.firstinspires.ftc.teamcode.subsystems.Intake

class IntakeCommands {
    class IntakeTurnOnCommand(intake: Intake) : InstantCommand({ intake.turnOn() }, intake)
    class IntakeTurnOffCommand(intake: Intake) : InstantCommand({ intake.turnOff() }, intake)
    class IntakeTurnReverseCommand(intake: Intake) : InstantCommand({ intake.turnReverse() }, intake)
}