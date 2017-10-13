package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Date;

/**
 * Created by Vlad Kravchnko on 10/10/2017.
 */
// whenever you create a test the word test mustbe starrting the method
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super (LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet ("my tweet");
        //Tweet myTweet2 = new NormalTweet ("my tweet");
        //test fails when there is a duplicate tweet illegalargument exception. if comment back in next line expection happens
        //tweets.addTweet(myTweet);
        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet ("my tweet");
        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));

    }
    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet ("my tweet");
        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));
    }
    public void testGetTweet() {
        //getTweet method will take an index and will return the tweet at that index
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), myTweet.getMessage());
        assertEquals(returnedTweet.getDate(), myTweet.getDate());
    }
    public void testGetTweets() {
        //getTweet method will take an index and will return the tweet at that index
        TweetList tweets = new TweetList();
        Date someDate = new Date(1994,10,20);
        Date someDate2 = new Date(1998,10,20);
        Tweet myTweet = new NormalTweet("my tweet",someDate);
        tweets.addTweet(myTweet);
        Tweet myTweet2 = new NormalTweet("my tweet2",someDate2);
        tweets.addTweet(myTweet2);
        Tweet myTweet3 = new NormalTweet("my tweet3");
        tweets.addTweet(myTweet3);
        boolean rightOrder = false;
        for (int i = 0; i < tweets.countTweet()-1;i++) {
            Tweet returnedTweet = tweets.getTweet(i);
            Tweet returnedTweet2 = tweets.getTweet(i + 1);
            if (returnedTweet.getDate().compareTo(returnedTweet2.getDate()) > 0) {
                rightOrder = true;
            }
            else {rightOrder = false;}
        }
        assertTrue("right order=" +rightOrder,rightOrder);
    }
    public void testCountTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet myTweet2 = new NormalTweet("my tweet2");
        tweets.addTweet(myTweet2);
        int count = tweets.countTweet();
        assertEquals(count,2);
    }

}
