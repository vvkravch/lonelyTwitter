package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Vlad Kravchnko on 10/10/2017.
 */
// made package private weaker declaration access
class TweetList {
    //Declaration needs final modifier. Changed ti make it package private
    private final ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    //add tweet to a list of tweets
    public void addTweet (Tweet tweet) throws IllegalArgumentException {
        //for (int k = 0, k < tweets.size(), k++){

        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }


    }
    //delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);

    }


   //add the
    public boolean hasTweet (Tweet tweet) {
        return tweets.contains(tweet);
    }

    //get tweet at given index from list of Tweets
    public Tweet getTweet(int index){

        return tweets.get(index);

    }
    public int countTweet() {
        return tweets.size();
    }
    //public Tweet getTweets(){
      //  return tweets.







}
