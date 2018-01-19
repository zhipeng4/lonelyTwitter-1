package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by zhipeng4 on 1/18/18.
 */

public class HappyMood extends CurrentMood {

    public HappyMood(String mood) {
        super(mood);
    }

    public HappyMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isSad() {
        return Boolean.FALSE;
    }
}
