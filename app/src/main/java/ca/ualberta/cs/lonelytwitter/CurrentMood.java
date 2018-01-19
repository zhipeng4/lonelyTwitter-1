package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zhipeng4 on 1/18/18.
 */

public abstract class CurrentMood {
    private String mood;
    private Date date;
    private ArrayList<CurrentMood> moods = new ArrayList<CurrentMood>();

    public CurrentMood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public CurrentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public String getMood() {

        return this.mood;
    }

    public void setMood(CurrentMood mood) {

        moods.add(mood);
    }

    public abstract Boolean isSad();
}
