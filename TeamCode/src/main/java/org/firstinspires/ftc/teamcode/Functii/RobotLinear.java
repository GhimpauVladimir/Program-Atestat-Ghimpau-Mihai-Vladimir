package org.firstinspires.ftc.teamcode.Functii;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public abstract class RobotLinear extends LinearOpMode {

    public Drive drive;
    public Brat brat;

    public void initialize() {
        drive = new Drive(hardwareMap);
        brat = new Brat(hardwareMap);
    }
}
