package com.nimych.springdemo;

public class ChessCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Play chess every day for a few games";
    }
}
