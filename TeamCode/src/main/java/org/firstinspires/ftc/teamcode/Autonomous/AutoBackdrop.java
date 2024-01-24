package org.firstinspires.ftc.teamcode.Autonomous;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

abstract public class AutoBackdrop extends AutoParent{

    protected void goToTapeFromStart(int targetZone) {

        forward(26);
        if (targetZone == LEFT_POSITION) {
            odoDriveTrain.turn(Math.toRadians(-98));
            sleep(800);
            back(23);
            /*Pose2d startPose = new Pose2d(0,0, Math.toRadians(0));
            odoDriveTrain.setPoseEstimate(startPose);
            Trajectory leftTape = odoDriveTrain.trajectoryBuilder(new Pose2d(0,0,0))
                    .lineToLinearHeading(new Pose2d(25,0,Math.toRadians(45)))
                    .build();
            odoDriveTrain.followTrajectory(leftTape);
            Pose2d startPose2 = leftTape.end();
            odoDriveTrain.setPoseEstimate(startPose2);*/
        } else if (targetZone == RIGHT_POSITION) {
            odoDriveTrain.turn((Math.toRadians(-98)));
        } else if (targetZone == MIDDLE_POSITION) {

        }
    }
    protected void goToBackdrop(int targetZone){
        if (targetZone == LEFT_POSITION) {
            lineToSpline(-16,-8,0);
            /*Pose2d startPose = new Pose2d(0,0, Math.toRadians(0));
            odoDriveTrain.setPoseEstimate(startPose);
            Trajectory leftTape = odoDriveTrain.trajectoryBuilder(new Pose2d(0,0,0))
                    .lineToLinearHeading(new Pose2d(-16,0,Math.toRadians(0)))
                    .build();
            //strafeleft(16);
            odoDriveTrain.followTrajectory(leftTape);
            Pose2d startPose2 = leftTape.end();
            odoDriveTrain.setPoseEstimate(startPose2);*/
        } else if (targetZone == RIGHT_POSITION) {
            lineToSpline(-38, 8, 0);
        } else if (targetZone == MIDDLE_POSITION) {
            odoDriveTrain.turn(Math.toRadians(-98));
            back(38);

        }

    }

    protected void park() {
        straferight(30);
        //odoDriveTrain.turn(Math.toRadians(adjustTurn(90)));
        //back(20);
        //odoDriveTrain.turn(Math.toRadians(adjustTurn(-90)));

    }
}
