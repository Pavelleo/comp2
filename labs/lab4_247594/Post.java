import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;

    public Post(String userName) {
        // Your code here
        this.userName = userName;
        this.timeStamp = Calendar.getInstance().getTime();
        this.likes = 0;
    }

    public String getUserName() {
        return userName;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    // Implement the methods required by the interface Likeable.
    // This file will not compile unless they are present with the correct name and
    // signature.

    public String toString() {
        String str = new String();
        str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
        return str;
    }

    public int compareTo(Post other) {
        // Your code here.
        return this.timeStamp.compareTo(other.timeStamp);
    }

    public boolean isPopular() {
        // Your code here.
        return this.likes > 100;
    }

    public void like() {
        this.likes++;
    }

    public int getLikes() {
        return this.likes;
    }

}

//
