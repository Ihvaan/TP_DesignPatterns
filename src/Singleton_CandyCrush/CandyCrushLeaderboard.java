package Singleton_CandyCrush;

import java.util.HashMap;
import java.util.Map;

public class CandyCrushLeaderboard {
    private Map<String, Integer> scores = new HashMap<>();
    private static CandyCrushLeaderboard instance;

    private CandyCrushLeaderboard() {
        scores.put("player1", 100);
        scores.put("player2", 200);
    }

    public static synchronized CandyCrushLeaderboard getInstance() {
        if (instance == null) {
            instance = new CandyCrushLeaderboard();
        }
        return instance;
    }

    public void addScore(String login, int score) {
        scores.put(login, score);
    }

    public Map<String, Integer> getScores() {
        return new HashMap<>(scores);
    }
}


