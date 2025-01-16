package main.java.controlsystem.devices;

import main.java.controlsystem.core.Device;

public class Lighting implements Device {
    private boolean power = false;
    private int brightness = 100; // 기본밝기는 100

    @Override
    public void turnOn() {
        power = true;
        System.out.println("조명 켜짐");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("조명 꺼짐");
    }

    @Override
    public String getStatus() {
        return "조명 상태: " + (power ? "켜짐" : "꺼짐") + ", 밝기: " + brightness + "%";
    }

    public void setBrightness(int brightness) {
        this.brightness = Math.min(100, Math.max(0, brightness)); // 0~100 사이 값으로 제한
        System.out.println("조명 밝기 " + this.brightness + "%로 설정");
    }
}
