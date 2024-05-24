package Strategy_BigData;

import java.util.ArrayList;
import java.util.List;

public class LinearRegression implements DataProcessing {
    @Override
    public List<CV> processCVs(List<CV> cvs) {
        List<CV> result = new ArrayList<>();
        for (CV cv : cvs) {
            if (cv.getContent().contains("CV 1") || cv.getContent().contains("CV 5")) {
                result.add(cv);
            }
        }
        return result;
    }
}
