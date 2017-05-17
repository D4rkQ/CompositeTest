/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public class Comment extends AbstractBugTrackerEntity {

    private final String comment;

    public Comment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public int getEstimation() {
        return 0;
    }
}
