package robotx.modules;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import robotx.libraries.XModule;

public class GolfMotorServo extends XModule {

    DcMotor liftMotor;
    DcMotor dropperMotor;

    Servo liftServo;

    double power = 1;

    public GolfMotorServo (OpMode op){
        super(op);
    }

    public void init() {
        liftMotor = opMode.hardwareMap.dcMotor.get("LiftMotor");
        dropperMotor = opMode.hardwareMap.dcMotor.get("DropperMotor");

        liftServo = opMode.hardwareMap.servo.get("IntakeMotor");
    }



    public void loop() {
        if (xGamepad2().x.isDown()) {
            liftMotor.setPower(power);
        }

        else if (xGamepad2().y.isDown()) {
            liftMotor.setPower(-power);
        }

        else {
            liftMotor.setPower(0.0);
        }

        if (xGamepad2().a.isDown()) {
            dropperMotor.setPower(power);
        }

        else if (xGamepad2().b.isDown()) {
            dropperMotor.setPower(-power);
        }

        else {
            dropperMotor.setPower(0.0);
        }

        if (xGamepad2().right_stick_button.wasPressed()){
            liftServo.setPosition(1);
        }
        if (xGamepad2().left_stick_button.wasPressed()){
            liftServo.setPosition(0);
        }


    }
}
