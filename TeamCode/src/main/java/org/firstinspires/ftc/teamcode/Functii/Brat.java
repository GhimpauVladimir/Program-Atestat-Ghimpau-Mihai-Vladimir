package org.firstinspires.ftc.teamcode.Functii;

import android.graphics.Path;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Brat {
    private Servo ServoSJ;
    private Servo ServoDI;
    private CRServo ServoCarusel;
    private boolean sj=false, oc=false, carusel =false;

    public Brat(@NonNull HardwareMap hardwareMap) {
        ServoSJ = hardwareMap.servo.get("Servo1");
        ServoDI = hardwareMap.servo.get("Servo2");
        ServoCarusel = hardwareMap.crservo.get("Servo3");
    }

    public void Up() {
        ServoSJ.setPosition(Servo.MAX_POSITION);
    }

    public void Down() {
        ServoSJ.setPosition(Servo.MIN_POSITION);
    }

    public void toggleUD() {
        if(sj) {
            Down();
        } else {
            Up();
        }
        sj = !sj;
    }

    public void Open() {
        ServoDI.setPosition(Servo.MAX_POSITION);
    }

    public void Close() {
        ServoDI.setPosition(Servo.MIN_POSITION);
    }

    public void toggleOC() {
        if(oc) {
            Close();
        } else {
            Open();
        }
        oc = !oc;
    }

    public void Start() {
        ServoCarusel.setPower(1);
    }

    public  void Stop() {
        ServoCarusel.setPower(0);
    }

    public void toggleCarusel() {
        if(carusel) {
            Start();
        } else {
            Stop();
        }
        carusel = !carusel;
    }

}
