package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by vvkravch on 9/12/17.
 */

public class Tweet {
    private String message;
    private Date date;

    public Tweet (String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet (String message, Date date){
        this.message = message;
        this.date=date;
    }
    public abstract Boolean isImportant();


    public void setMessage (String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();

        }
        else {
            this.message = message;
        }
    }
    public String getDate(){
        return date;
    }
    public void setDate (Date date){
        this.date = date;
    }
}
