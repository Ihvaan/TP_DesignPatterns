package Strategy_BigData;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<CV> cvs = new ArrayList<>();
        cvs.add(new CV("CV 1 content"));
        cvs.add(new CV("CV 2 content.pdf"));
        cvs.add(new CV("CV 3 content informatique"));
        cvs.add(new CV("CV 4 content"));
        cvs.add(new CV("CV 5 content"));

        RecruitmentView view = new RecruitmentView(cvs, new LinearRegression());
        System.out.println("Linear Regression: ");
        view.processCVs().forEach(cv -> System.out.println(cv.getContent()));

        view.setDataProcessing(new ClassificationTree());
        System.out.println("\nClassification Tree: ");
        view.processCVs().forEach(cv -> System.out.println(cv.getContent()));

        view.setDataProcessing(new KMeansPartitioning());
        System.out.println("\nK-Means Partitioning: ");
        view.processCVs().forEach(cv -> System.out.println(cv.getContent()));
    }
}

