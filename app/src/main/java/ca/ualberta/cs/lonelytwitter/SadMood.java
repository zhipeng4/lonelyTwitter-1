package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by zhipeng4 on 1/18/18.
 */

public class SadMood extends CurrentMood {
    public SadMood(String mood) {
        super(mood);
    }

    public SadMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isSad() {
        return Boolean.TRUE;
    }
}
