import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DoorLock {

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock(Combination combination) {
        // Your code here
        this.combination = combination;
        open = false;
        activated = true;
        numberOfAttempts = 0;
    }

    // Access methods.

    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    // Notice that numberOfAttempts is compared to
    // MAX_NUMBER_OF_ATTEMPTS only when its value has been
    // incremented, Also, numberOfAttempts should be set to zero when
    // activated is false. Problems related to the combined action of
    // these two variables have caused problems for some students.

    public boolean open(Combination combination) {

        // Put your code here, then remove the line below.
        if (activated) {
            if (this.combination.equals(combination)) {
                open = true;
                numberOfAttempts = 0;
            } else {
                numberOfAttempts++;
            }
        }

        if (numberOfAttempts == MAX_NUMBER_OF_ATTEMPTS)
            activated = false;
        return true;
    }

    public void activate(Combination c) {
        // Put your code here, then remove this comment.

        if (this.combination.equals(c))
            activated = true;
    }

}