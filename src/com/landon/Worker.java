package com.landon;

public class Worker {

    public String yon() {
        return "did you miss me?";
    }

    public String conMethod(boolean data) {
        if (data) {
            // true
            return "The value was true";
        } else {
            // false
            return "the value was false";
        }
    }

    public String loopMethod(int amount) {
        // for (int i=0; i<amount; ++i) {
        String value = "loops: ";
        for (int i=0; i < amount; ++i ) {
            value += "I";
        }
        value += "\ntotal: " + amount;
        return value;
    }
}