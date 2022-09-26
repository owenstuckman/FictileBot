package robotx.modules;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import robotx.libraries.XModule;

public class FictileMotorServo extends XModule {

    DcMotor Motor1;
    DcMotor Motor2;
    DcMotor Motor3;
    DcMotor Motor4;


    double power = 1;


    public boolean slowMode = false;

    public FictileMotorServo(OpMode op){
        super(op);
    }

    public void init() {
        Motor1 = opMode.hardwareMap.dcMotor.get("Motor1");
        Motor2 = opMode.hardwareMap.dcMotor.get("Motor2");
        Motor3 = opMode.hardwareMap.dcMotor.get("Motor3");
        Motor4 = opMode.hardwareMap.dcMotor.get("Motor4");

    }

    public void toggleSlow(){
        if (slowMode){
            slowMode = false;
        }

        else {
            slowMode = true;
        }
    }



    public void loop() {

        if (xGamepad1().dpad_up.isDown()) {
            Motor1.setPower(1);
            Motor2.setPower(-1);
            Motor3.setPower(1);
            Motor4.setPower(1);
        }
        else {
            Motor1.setPower(0);
            Motor2.setPower(0);
            Motor3.setPower(0);
            Motor4.setPower(0);

        }

        if (xGamepad1().dpad_down.isDown()) {
            Motor1.setPower(-1);
            Motor2.setPower(1);
            Motor3.setPower(-1);
            Motor4.setPower(-1);

        }
        else {
            Motor1.setPower(0);
            Motor2.setPower(0);
            Motor3.setPower(0);
            Motor4.setPower(0);

        }
        if (xGamepad1().dpad_right.isDown()){
            Motor1.setPower(-1);
            Motor2.setPower(-1);
            Motor3.setPower(-1);
            Motor4.setPower(1);
        }
        else {
            Motor1.setPower(0);
            Motor2.setPower(0);
            Motor3.setPower(0);
            Motor4.setPower(0);

        }
        if (xGamepad1().dpad_left.isDown()){
            Motor1.setPower(1);
            Motor2.setPower(1);
            Motor3.setPower(1);
            Motor4.setPower(-1);
        }
        else {
            Motor1.setPower(0);
            Motor2.setPower(0);
            Motor3.setPower(0);
            Motor4.setPower(0);
        }
    }
}
