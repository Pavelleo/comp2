// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
        // Your code here.
        messages = new Post[MAX_SIZE];
        size = 0;
    }

    public void add(Post message) {
        // Your code here.
        if (size < MAX_SIZE) {
            messages[size] = message;
            size++;
        }
    }

    public Post get(int index) {
        return messages[index];
    }

    public int size() {
        return size;
    }

    public void sort() {
        int i, j, argMin;
        Post tmp;
        for (i = 0; i < size - 1; i++) {
            argMin = i;
            for (j = i + 1; j < size(); j++) {
                if (messages[j].compareTo(messages[argMin]) < 0) {
                    argMin = j;
                }
            }

            tmp = messages[argMin];
            messages[argMin] = messages[i];
            messages[i] = tmp;
        }

    }

    public NewsFeed getPhotoPost() {
        // Your code here
        NewsFeed photos = new NewsFeed();
        for (int i = 0; i < this.size; i++) {
            if (this.messages[i] != null) {
                if (this.messages[i] instanceof PhotoPost) {
                    photos.add(this.messages[i]);
                }
            }
        }

        return photos;
    }

    public NewsFeed plus(NewsFeed other) {
        // Your code here
        NewsFeed newfeed = new NewsFeed();
        for (int i = 0; i < this.size; i++) {
            newfeed.add(this.messages[i]);
        }
        for (int i = 0; i < other.size; i++) {
            newfeed.add(other.messages[i]);
        }
        return newfeed;
    }

}
