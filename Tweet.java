/* Tweetir class */

public class Tweet{
    /* Tweer id */
    private String tweet_id;
    /* Tweet Message */
    private String tweet_message;
    /**
     * Initialization Tweet
     */
    public Tweet(String tweet_id , String tweet_message)
    {
        this.tweet_id = tweet_id;
        this.tweet_message = tweet_message;
        System.out.println("@" + this.tweet_id + " " + this.tweet_message);
    }
    /* Creat a new tweet  */
    public void newTweet(String tweet_id , String tweet_message)
    {
        this.tweet_id = tweet_id;
        this.tweet_message = tweet_message;
        System.out.println("@" + this.tweet_id + " " + this.tweet_message);
    }
    /* Reply to Tweet */
    public void replay(String tweet_ids , String tweet_message)
    {
        
        this.tweet_message = tweet_message;
        System.out.println("@" + tweet_ids + " " + "@" + this.tweet_id + " " + this.tweet_message);
    }
    /**
     * In order to give value to the private variable tweet_id
     */
    public void setTweetId(String tweet_id)
    {  
        this.tweet_id = tweet_id;
    }
    /**
     * getId : In order to use the privat variable tweet_id
     */
    public String getTweetId()
    {
        return this.tweet_id;
    }
    /**
     * In order to give value to the private variable tweet_message
     */
    public void setTweetMesaage(String tweet_message)
    {
        this.tweet_message = tweet_message;
    }
    /**
     * getId : In order to use the privat variable tweet_message
     */
    public String getTweetMessage()
    {
        return this.tweet_message;
    }
    
}
