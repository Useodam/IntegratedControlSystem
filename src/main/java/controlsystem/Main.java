package main.java.controlsystem;

import main.java.controlsystem.controller.IntegratedController;
import main.java.controlsystem.devices.Lighting;
import main.java.controlsystem.devices.Projector;
import main.java.controlsystem.devices.Screen;

public class Main {
    public static void main(String[] args) {
        IntegratedController controller = new IntegratedController();

        controller.addDevice("메인 프로젝터", new Projector());
        controller.addDevice("무대 조명", new Lighting());
        controller.addDevice("프로젝터 스크린", new Screen());

        //전체 상태 확인
        System.out.println("==== 초기상태 ====");
        controller.getStatusAll();

        //모든 장치 켜기
        System.out.println("==== 전체 전원 켜기 ====");
        controller.turnOnAll();

        //프로젝터 설정 변경
        System.out.println("==== 프로젝터 설정 변경 ====");
        Projector projector = (Projector) controller.getDevice("메인 프로젝터");
        projector.setInput("HDMI2");

        //조명 설정 변경
        System.out.println("==== 조명 설정 변경 ====");
        Lighting lighting = (Lighting) controller.getDevice("무대 조명");
        lighting.setBrightness(50);

        //스크린 조작
        System.out.println("==== 스크린 조작 ====");
        Screen screen = (Screen) controller.getDevice("프로젝터 스크린");
        screen.moveDown();
        System.out.println(screen.getStatus());
        screen.moveUp();
        System.out.println(screen.getStatus());

        //최종 상태 확인
        System.out.println("==== 최종 상태 확인 ====");
        controller.getStatusAll();

        //전체 전원 끄기
        System.out.println("==== 전체 전원 끄기 ====");
        controller.turnOffAll();
    }
}
