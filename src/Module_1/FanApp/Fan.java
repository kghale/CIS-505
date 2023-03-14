package Module_1.FanApp;

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int SPEED = STOPPED;
    private boolean FAN_STATUS = false;
    private double RADIUS = 6.0;
    private String COLOR = "white";

    public Fan() {
        this.SPEED = STOPPED;
        this.FAN_STATUS = false;
        this.RADIUS = 6;
        this.COLOR = "white";
    }

    public Fan(int SPEED, boolean FANSTATUS, double RADIUS, String COLOR) {
        this.SPEED = SPEED;
        this.FAN_STATUS = FANSTATUS;
        this.RADIUS = RADIUS;
        this.COLOR = COLOR;
    }


    public int getSTOPPED() {
        return STOPPED;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSPEED() {
        return SPEED;
    }

    public void setSPEED(int SPEED) {
        this.SPEED = SPEED;
    }

    public boolean isFAN_STATUS() {
        return FAN_STATUS;
    }

    public void setFAN_STATUS(boolean FAN_STATUS) {
        this.FAN_STATUS = FAN_STATUS;
    }

    public double getRADIUS() {
        return RADIUS;
    }

    public void setRADIUS(double RADIUS) {
        this.RADIUS = RADIUS;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    @Override
    public String toString() {
        if (FAN_STATUS) {
            return "The fan is set to " + SPEED + " with a color of " + COLOR + " and the radius of " + RADIUS;
        } else {
            return "The fan is " + COLOR + " with a radius of " + RADIUS + " and the fan is off.";
        }
    }
}
