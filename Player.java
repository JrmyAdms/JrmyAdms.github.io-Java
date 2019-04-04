package soccer;

public class Player {

    private int goalsScored;
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() {
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void incGoalsScored() {
        this.goalsScored++;
    }

    /**
     * @return the goalsScored
     */
    public int getGoalsScored() {
        return goalsScored;
    }

    /**
     * @param goalsScored the goalsScored to set
     */
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

}
