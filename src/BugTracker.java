/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public class BugTracker extends AbstractBugTrackerEntity {
    protected int estimation;


    public void addIssue( BugTrackerEntity bugTrackerEntity ) {
        this.children.add( bugTrackerEntity );
    }

    @Override
    public int getEstimation() {
        return 0;
    }
}
