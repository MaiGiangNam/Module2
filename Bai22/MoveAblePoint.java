package Bai22;

public class MoveAblePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(float x , float y , float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(){
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public String toString(){
        return "Point = (" + getX() + " , " + getY() + ")\n" +
                "Speed = (" + getxSpeed() + " , " + getySpeed() + ")"
                ;
    }

}
