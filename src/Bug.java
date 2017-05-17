/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public class Bug extends AbstractBugTrackerEntity {

    private final String description;
    private final int estimate;


    public Bug(String description, int estimate) {
        this.description = description;
        this.estimate = estimate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int getEstimation() {
        return estimate;
    }
}
