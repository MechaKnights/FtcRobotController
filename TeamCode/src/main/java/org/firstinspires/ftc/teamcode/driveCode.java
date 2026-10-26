package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class driveCode extends DriveCodeCommon {


    @Override
    public void runOpMode() {
        waitForStart();
        while (opModeIsActive()) {
            MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, 0));
            drives(drive);
            intake(drive);
            shooter(drive);
        }
    }
}