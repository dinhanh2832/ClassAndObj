package com.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }

    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }

    StopWatch() {
        startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
        this.getStartTime(startTime);
    }

    public void stop() {
        this.endTime = LocalTime.now();
        this.getEndTime(endTime);
    }

    public void getElapsedTime() {
        int ElaspedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay());
        System.out.println("Số mili giây đếm đc:" + ElaspedTime);
    }
}

