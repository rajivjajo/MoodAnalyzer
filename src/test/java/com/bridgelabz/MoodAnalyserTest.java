package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {

    static MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void whenGivenMoodShouldReturnSAD() {
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void whenGivenMoodShouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}