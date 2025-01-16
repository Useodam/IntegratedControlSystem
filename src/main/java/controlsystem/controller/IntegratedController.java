package main.java.controlsystem.controller;

import main.java.controlsystem.core.Device;

import java.util.HashMap;
import java.util.Map;

public class IntegratedController {
    private Map<String, Device> devices = new HashMap<>();

    //장치 추가
    public void addDevice(String name, Device device) {
        devices.put(name, device);
        System.out.println(name + " 장치가 추가되었습니다.");
    }

    //장치 제거
    public void removeDevice(String name) {
        if(devices.remove(name) != null) {
            System.out.println(name + " 장치가 제거되었습니다.");
        } else {
            System.out.println(name + " 장치를 찾을 수 없습니다.");
        }
    }

    //모든 장치 켜기
    public void turnOnAll(){
        devices.forEach((name,device)->{
            device.turnOn();
            System.out.println(name + ": " + device.getStatus());
        });
    }

    //모든 장치 끄기
    public void turnOffAll(){
        devices.forEach((name,device)->{
            device.turnOff();
            System.out.println(name + ": " + device.getStatus());
        });
    }

    //특정 장치 가져오기
    public Device getDevice(String name) {
        return devices.get(name);
    }

    //모든 장치의 상태 확인
    public void getStatusAll(){
        if(devices.isEmpty()) {
            System.out.println("등록된 장치가 없습니다.");
            return;
        }

        System.out.println("===모든 장치 상태===");
        devices.forEach((name,device)->{
            System.out.println(name + ": " + device.getStatus());
        });
    }
}
