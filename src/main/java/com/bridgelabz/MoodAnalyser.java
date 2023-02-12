package com.bridgelabz;

public class MoodAnalyser {
    private String message;

    //Default Constructor
    public MoodAnalyser(){
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
