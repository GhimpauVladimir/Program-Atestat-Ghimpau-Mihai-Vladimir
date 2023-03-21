package org.firstinspires.ftc.teamcode.Autonom;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Functii.RobotLinear;

@Autonomous(name = "Autonomie", group = "Final")

public class Autonomie extends RobotLinear {


    @Override
    public void runOpMode() {
        initialize();
        waitForStart();
        drive.forward(30);
        drive.left(30);
        sleep(1000);
        brat.toggleUD();
        sleep(1000);
        brat.toggleOC();
        sleep(1000);
        drive.right(30);
        drive.backward(45);
        sleep(1000);
        brat.toggleCarusel();
        sleep(3000);
        brat.toggleCarusel();
    }
}
