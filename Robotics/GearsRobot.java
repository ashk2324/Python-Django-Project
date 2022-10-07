import ch.aplu.robotsim.*;

public class GearsRobot{
    public GearsRobot() {
        NxtRobot nxtRobot = new NxtRobot();
        Gear gear = new Gear();
        nxtRobot.addPart(gear);

        gear.setSpeed(150);
        gear.forward(100);
        gear.left(10);
        gear.right(20);
    }

    public static void main(String[] args) {
        new GearsRobot();
    }
}