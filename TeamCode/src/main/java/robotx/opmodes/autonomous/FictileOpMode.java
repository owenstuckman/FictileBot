package robotx.opmodes.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import robotx.libraries.XOpMode;
import robotx.modules.FictileMotorServo;


@TeleOp(name = "GolfBotOpMode", group = "Default")

public class FictileOpMode extends XOpMode {

    FictileMotorServo fictileMotorServo;

    public void initModules() {                                                                 

        super.initModules();

        fictileMotorServo = new FictileMotorServo(this);
        activeModules.add(fictileMotorServo);



    }

    public void init() {
        super.init();
    }
}

/*
Controls
GamePad 1:
Joysticks to move
B to reset robot orientation
Left bumper to toggle slow mode
Right bumper to toggle super slow mode

Gamepad 2:
intake x and y
lift a and b
duck motor right back and left back


}*/