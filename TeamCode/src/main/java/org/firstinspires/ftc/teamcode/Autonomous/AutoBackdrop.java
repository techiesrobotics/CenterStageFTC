package org.firstinspires.ftc.teamcode.Autonomous;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import kotlin.math.UMathKt;

abstract public class AutoBackdrop extends AutoParent{

    protected void goToTapeFromStart(int targetZone) {
        //make it move more if it is on position 2
        forward(26);// -(targetZone%2 -1)*2);
        if (targetZone == LEFT_POSITION) {
            odoDriveTrain.turn(adjustTurn(Math.toRadians(-98)));
            sleep(800);
            back(20);
            straferight(4);
            /*Pose2d startPose = new Pose2d(0,0, Math.toRadians(0));
            odoDriveTrain.setPoseEstimate(startPose);
            Trajectory leftTape = odoDriveTrain.trajectoryBuilder(new Pose2d(0,0,0))
                    .lineToLinearHeading(new Pose2d(25,0,Math.toRadians(45)))
                    .build();
            odoDriveTrain.followTrajectory(leftTape);
            Pose2d startPose2 = leftTape.end();
            odoDriveTrain.setPoseEstimate(startPose2);*/
        } else if (targetZone == RIGHT_POSITION) {
            odoDriveTrain.turn(adjustTurn(Math.toRadians(-98)));
        } else if (targetZone == MIDDLE_POSITION) {

        }
    }
    protected void goToBackdrop(int targetZone){
        if (targetZone == LEFT_POSITION) {
            strafeleft(4);
            lineToSpline(-15,adjustTrajectorydistance(-7),0);
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
            lineToSpline(-38, adjustTrajectorydistance(8), 0);
        } else if (targetZone == MIDDLE_POSITION) {
            back(2);
            odoDriveTrain.turn(adjustTurn(Math.toRadians(-98)));
            lineToSpline(-35, adjustTrajectorydistance(4), 0);
        }

    }

    protected void park() {
        straferight(adjustTrajectorydistance(30));
        back(8);
        //odoDriveTrain.turn(Math.toRadians(adjustTurn(90)));
        //back(20);
        //odoDriveTrain.turn(Math.toRadians(adjustTurn(-90)));

    }
}
