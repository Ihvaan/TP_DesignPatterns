package Singleton_CandyCrush;

public class User {
    public static void main(String[] args) {
        CandyCrushLeaderboard leaderboard = CandyCrushLeaderboard.getInstance();

        leaderboard.addScore("player3", 150);
        leaderboard.addScore("player4", 250);

        System.out.println("Scores: " + leaderboard.getScores());

        CandyCrushLeaderboard anotherLeaderboard = CandyCrushLeaderboard.getInstance();
        System.out.println("Same instance: " + (leaderboard == anotherLeaderboard));
    }
}