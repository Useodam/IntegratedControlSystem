package main.java.controlsystem.devices;

import main.java.controlsystem.core.Device;

public class Screen implements Device {
    private boolean power = false;
    private boolean isDown = false; // 스크린이 내려와있는지 여부

    @Override
    public void turnOn() {
        power = true;
        System.out.println("스크린 전원 켜짐");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("스크린 전원 꺼짐");
    }

    @Override
    public String getStatus() {
        return "스크린 상태: " + (power ? "켜짐" : "꺼짐") + ", 스크린: " + (isDown ? "내려옴" : "올라감");
    }

    public void moveDown(){
        if(power && !isDown){
            isDown = true;
            System.out.println("스크린이 내려옵니다.");
        }
    }

    public void moveUp(){
        if(power && isDown){
            isDown = false;
            System.out.println("스크린이 올라갑니다.");
        }
    }
}
