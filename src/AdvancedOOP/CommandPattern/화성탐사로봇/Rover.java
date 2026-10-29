package AdvancedOOP.CommandPattern.화성탐사로봇;

// Receiver
public class Rover {
    public void move(int distance) {
        System.out.printf("Rover가 %d거리만큼 움직임. 주어진 거리가 양수일 때 앞으로, 음수일 때 뒤로 움직임\n", distance);
    }

    public void collectSample() {
        System.out.println("표본을 채집");
    }

    public void takePictures() {
        System.out.println("사진을 찍기");
    }

    public void transmitPicture() {
        System.out.println("사진을 전송");
    }
}
