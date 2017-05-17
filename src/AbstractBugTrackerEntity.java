import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public abstract class AbstractBugTrackerEntity implements BugTrackerEntity {

    protected final List<BugTrackerEntity> children = new ArrayList<>();
    protected int estimation;

    @Override
    public int getEstimation() {
        return this.getEstimation();
    }

    @Override
    public int getTotalEstimation() {
        int tmp = 0;
        for (BugTrackerEntity x: children) {
            tmp += x.getEstimation();
        }

        return tmp;
    }
}




