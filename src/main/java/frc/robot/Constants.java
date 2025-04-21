// XRP Project Constants

package frc.robot;

public final class Constants {


  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class DrivetrainConstants {
    private static final double kGearRatio =
      (30.0 / 14.0) * (28.0 / 16.0) * (36.0 / 9.0) * (26.0 / 8.0); // Total gear ratio is 48.75 motor rotations to 1 wheel revolution
    private static final double kCountsPerMotorShaftRev = 12.0; // Encoder(?) counts per motor shaft revolution
    private static final double kCountsPerRevolution = kCountsPerMotorShaftRev * kGearRatio; // 585.0 counts per wheel revolution
    private static final double kWheelDiameterInch = 2.3622; // 60 mm
  }
}
