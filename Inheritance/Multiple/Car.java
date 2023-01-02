package Multiple;

public class Car {
    private int maxSpeed;
    private String color;
    public void carinformation(){
        System.out.println("Car Color =  "+color + " Maximum Speed = "+ maxSpeed);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
}
