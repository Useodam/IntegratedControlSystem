package main.java.controlsystem.devices;

import main.java.controlsystem.core.Device;

public class Projector implements Device {
    private boolean power = false;
    private String input = "HDMI1";

    @Override
    public void turnOn() {
        power = true;
        System.out.println("프로젝터 전원 켜짐");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("프로젝터 전원 꺼짐");
    }

    @Override
    public String getStatus() {
        return "프로젝터 상태 :" + (power ? "켜짐" : "꺼짐") + ", 입력: " + input;
    }
    
    public void setInput(String input) {
        this.input = input;
        System.out.println("프로젝터 입력을" + input + "로 변경");
    }
}
