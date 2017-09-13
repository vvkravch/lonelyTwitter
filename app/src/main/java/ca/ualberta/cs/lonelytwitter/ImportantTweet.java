package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by vvkravch on 9/12/17.
 */

public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super (message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }
    @Override
    public Boolean IsImportant(){
        return Boolean.TRUE;
    }
}
