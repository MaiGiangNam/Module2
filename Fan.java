public class Fan {
    public static final int SlOW =1;
    public static final int MEDIUM =2;
    public static final int FAST =3;
    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    public Fan(int speed, boolean on, double radius, String colour) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String toString (){
        if(on) return "speed"+speed+", color: " + colour + ", radius: " + radius + " fan is on";
        else return "color: " + colour + ", radius: " + radius + " fan is off";
    }

    public static void main(String[] args) {
        Fan fan1=new Fan(FAST,true,10,"yellow");
        Fan fan2=new Fan(MEDIUM,false,5,"blue");
        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: "+ fan2);
    }
}
