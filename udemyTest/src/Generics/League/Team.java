package Generics.League;

public abstract class Team<T extends Team> implements Comparable<Team<T>> {

    private String teamName;
    private int matchLoss = 0;
    private int matchWon = 0;
    private int matchDraw = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMatchLoss() {
        return matchLoss;
    }

    public void setMatchLoss(int matchLoss) {
        this.matchLoss = matchLoss;
    }

    public int getMatchWon() {
        return matchWon;
    }

    public void setMatchWon(int matchWon) {
        this.matchWon = matchWon;
    }

    public int getMatchDraw() {
        return matchDraw;
    }

    public void setMatchDraw(int matchDraw) {
        this.matchDraw = matchDraw;
    }

    public int ranking() {
        return (getMatchWon() * 2 + getMatchDraw());
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return +1;
        } else if (this.ranking() < team.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                '}';
    }
}
