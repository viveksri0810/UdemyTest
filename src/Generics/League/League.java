package Generics.League;

import java.util.ArrayList;

public class League<T extends Team> {

    public String leagueName;
    ArrayList<T> listOfTeamInLeague = new ArrayList<>();


    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String addTeamInLeague(T team) {
        if (listOfTeamInLeague.contains(team)) {
            return "Team Already Exist";
        } else {
            listOfTeamInLeague.add(team);
            return team + " added is league";
        }
    }

    public int noOfTeamInLeague() {
        return listOfTeamInLeague.size();
    }


    public String match(T team1, T team2, String result) {
        if (result.equalsIgnoreCase("won")) {
            team1.setMatchWon(team1.getMatchWon() + 1);
            team2.setMatchLoss(team2.getMatchLoss() + 1);
            return "result added";
        } else if (result.equalsIgnoreCase("loss")) {
            team2.setMatchWon(team2.getMatchWon() + 1);
            team1.setMatchLoss(team1.getMatchLoss() + 1);
            return "result added";
        } else if (result.equalsIgnoreCase("draw")) {
            team1.setMatchWon(team1.getMatchDraw() + 1);
            team2.setMatchWon(team2.getMatchDraw() + 1);
            return "result added";
        } else {
            return "please enter a valid result";
        }
    }


    public void leagueTable() {
//        Collections.sort(listOfTeamInLeague);
        for (T team : listOfTeamInLeague) {
            System.out.println(team.getTeamName() + " : " + team.ranking());
        }
    }


}
