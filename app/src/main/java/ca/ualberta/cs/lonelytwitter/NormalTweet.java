package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import Tweet;

/**
 * Created by vvkravch on 9/12/17.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
