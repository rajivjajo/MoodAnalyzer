package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("Sad")){
            return "SAD";
        }
        else if (message.contains("Happy")) {
            return "HAPPY";
        }
        else {
            return "UNKNOWN";
        }
    }
}