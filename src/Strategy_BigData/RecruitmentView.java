package Strategy_BigData;

import java.util.List;

public class RecruitmentView {
    private List<CV> cvs;
    private DataProcessing dataProcessing;

    public RecruitmentView(List<CV> cvs, DataProcessing dataProcessing) {
        this.cvs = cvs;
        this.dataProcessing = dataProcessing;
    }

    public void setDataProcessing(DataProcessing dataProcessing) {
        this.dataProcessing = dataProcessing;
    }

    public List<CV> processCVs() {
        return dataProcessing.processCVs(cvs);
    }
}
