package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MoodAnalyserTest {

    @Test
    public void whenGivenMoodShouldReturnSAD(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }
    @Test
    public void whenGivenAnyMoodShouldReturnHAPPY(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }
}