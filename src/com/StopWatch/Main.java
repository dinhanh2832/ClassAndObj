package com.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for(int i = 0; i < 10;i++) {
            stopWatch.stop();
            stopWatch.getElapsedTime();
        }
    }
}
