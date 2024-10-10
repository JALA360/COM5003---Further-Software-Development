package com.mycompany.testfan;

public class Fan {
    
    private boolean isOn; // Fan on/off status - set to off on program restart
    private int speed;    // Fan's speed - set to 1 on program restart

    public Fan() {
        isOn = false;
        speed = 0;     // Speed is 0 when the fan is off
    }

    // Turn on the fan and set default speed
    public void turnOn() {
        isOn = true;
        speed = 1;    // Default speed when fan is turned on
        System.out.println("Fan is now ON at speed: " + speed);
    }

    // Turn fan off and set speed to 0
    public void turnOff() {
        isOn = false;
        speed = 0;
        System.out.println("Fan is now OFF.");
    }

    // Set the fan speed if it is on
    public void setSpeed(int newSpeed) {
        if (isOn) {
            if (newSpeed >= 1 && newSpeed <= 5) { // Speed range check
                speed = newSpeed;
                System.out.println("Fan speed set to: " + speed);
            } else {
                System.out.println("Invalid input. Input a number between 1 and 5.");
            }
        } else {
            System.out.println("Fan is off. Please turn on fan to set the speed.");
        }
    }

    // Get the current on/off state of the fan
    public boolean getFanIsOn() {
        return isOn;
    }

    // Current fan speed
    public int getSpeed() {
        if (isOn) {
            return speed;
        } else {
            System.out.println("Fan is off. Speed is 0.");
            return 0;
        }
    }
}