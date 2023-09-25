package Composition.Challenge2;

public class Lamp {
    private String style;
     private boolean battery;
     private int globRating;

     //Constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    //Methods

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery(){
        return battery;
    }
}
