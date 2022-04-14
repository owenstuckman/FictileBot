package robotx.modules;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import robotx.libraries.XModule;

public class FictileMotorServo extends XModule {

    DcMotor Motor1;
    DcMotor Motor2;

    Servo TurnServo;

    double power = 1;


    public boolean slowMode = false;

    public FictileMotorServo(OpMode op){
        super(op);
    }

    public void init() {
        Motor1 = opMode.hardwareMap.dcMotor.get("Motor1");
        Motor2 = opMode.hardwareMap.dcMotor.get("Motor2");

        TurnServo = opMode.hardwareMap.servo.get("TurnServo");
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

        if (xGamepad1().x.isDown()) {
            Motor1.setPower(power);
            Motor2.setPower(power);
        }
        else {
            Motor1.setPower(0);
            Motor2.setPower(0);
        }

        if (xGamepad1().y.isDown()) {
            Motor1.setPower(-power);
            Motor2.setPower(-power);
        }
        else {
            Motor1.setPower(0);
            Motor2.setPower(0);
        }

        if (xGamepad1().dpad_left.isDown()){
            TurnServo.setPosition(.2);
        }
        if (xGamepad1().dpad_left.wasReleased()){
            TurnServo.setPosition(.36);
        }

        if (xGamepad1().dpad_right.isDown()){
            TurnServo.setPosition(.6);
        }
        if (xGamepad1().dpad_right.wasReleased()){
            TurnServo.setPosition(.36);
        }

    }
}
