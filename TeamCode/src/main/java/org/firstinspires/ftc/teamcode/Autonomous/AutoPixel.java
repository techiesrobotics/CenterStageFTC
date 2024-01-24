package org.firstinspires.ftc.teamcode.Autonomous;

abstract public class AutoPixel extends AutoParent {

    protected void goToTapeFromStart(int targetZone) {

        forward(27);
        if (targetZone == LEFT_POSITION) {
            odoDriveTrain.turn(Math.toRadians(98));
            sleep(400);
            forward(4);

        } else if (targetZone == RIGHT_POSITION) {
            odoDriveTrain.turn((Math.toRadians(-98)));
            sleep(400);
        } else if (targetZone == MIDDLE_POSITION) {
            sleep(400);
            strafeleft(5);

        }
    }

    protected void goToBackdrop(int targetZone){
        if (targetZone == LEFT_POSITION) {
            back(4);
            odoDriveTrain.turn((Math.toRadians(-98)));
            back(25);
            odoDriveTrain.turn((Math.toRadians(-98)));
            back(86);
            straferight(11);
            strafeleft(23);
            sleep(400);

        } else if (targetZone == RIGHT_POSITION) {
            //lineToSpline(-38, 8, 0);
            back(2);
            odoDriveTrain.turn((Math.toRadians(98)));
            back(25);
            odoDriveTrain.turn((Math.toRadians(-98)));
            back(85);
            strafeleft(28);
            sleep(400);
        } else if (targetZone == MIDDLE_POSITION) {
          //  back(38);
            straferight(5);
            back(25);
            sleep(400);
            odoDriveTrain.turn((Math.toRadians(-98)));
            back(85);
            straferight(10);
            strafeleft(29);
            sleep(400);

        }
    }

    @Override

    protected void park() {

    }
}
