/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {
  // Drivetrain
  public static int leftDrivetrain = 1;
  public static int rightDrivetrain = 0;

  public static int leftDrivetrainEncoderA = 0;
  public static int leftDrivetrainEncoderB = 1;
  public static int rightDrivetrainEncoderA = 2;
  public static int rightDrivetrainEncoderB = 3;

  public static double drivetrainEncoder_RadiansPerPulse = 2*3.14/512; //Check, assume encoders have 512 pulse/rev
  public static double drivetrainEncoder_MaxPeriod = 1.0;
  public static double drivetrainEncoder_MinRate = 6*3.14;

  public static boolean leftDrivetrainEncoder_Reverse = false;
  public static boolean rightDrivetrainEncoder_Reverse = true;
  //adjust torque here
  public static double drivetrainPower = 0.75;
  public static double fineDrivetrainPower = 0.8;



//main Autonomous
//public static int LineSensor1 = 10;
//public static int LineSensor2 = 11;
//public static int LineSensor3 = 12;

  // Shooter
  //public static int topShooter = 4;
 // public static int bottomShooter = 2;
  public static int mainShooter = 4;

  public static double shooterPower = 1.00;


  // Intake
  public static int intakeRoller = 2;
  //public static int intakeExtender = 8;

  public static double intakeSpeed = 0.8;
  public static double intakeSpeedAdjusted = 0.8;

  //public static double rollerExtendPower = 0.3;


  // Magazine
  public static int magazineMotor = 3;

  public static int magazineEncoderA = 4;
  public static int magazineEncoderB = 5;

  public static double magazinePower = 1.0;

  public static double indexDelay = 0.5;  // indexDelay should be the same as indexDelayAdjusted
  public static double indexDelayAdjusted = 0.5; 

  public static boolean delayIsAdjusted = false;

  //public static int numberOfBalls = 0;

  public static double magazineEncoder_RadiansPerPulse = 2*3.14/512; //Check, assume encoders have 512 pulse/rev
  public static double magazineEncoder_MaxPeriod = 1.0;
  public static double magazineEncoder_MinRate = 6*3.14;

  public static boolean magazineEncoder_Reverse = false;

  public static double magazineRotationDistance = 0.01; // Tune this!


  // Elevator
  /*public static int extendElevator = 5;
  public static int liftRobot = 6;

  public static double extendPower = 0.5;
  public static double liftPower = 0.8;
*/

  // Controller Ports
  public static int XboxController0 = 0;
  public static int XboxController1 = 1;


  // Miscellany
  public static boolean collectMode = false;


  // For Testing
  public static boolean activateSensor = true;
  public static boolean rotationMode = false;
  public static boolean autoMode = false;


  // public static boolean toggleOn1 = false;
  // public static boolean togglePressed1 = false;
  // public static boolean toggleOn2 = false;
  // public static boolean togglePressed2 = false;

  // public static boolean fullPower = true;
  // public static boolean power83 = false;
  // public static boolean threeFourthsPower = false;
}