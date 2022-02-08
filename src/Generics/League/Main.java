package Generics.League;

public class Main {

    public static void main(String[] args) {

        FootbalTeam footballTeam1 = new FootbalTeam("FootballTeam1");
        FootbalTeam footballTeam2 = new FootbalTeam("FootballTeam2");
        CricketTeam cricketTeam1 = new CricketTeam("CricketTeam1");
        CricketTeam cricketTeam2 = new CricketTeam("CricketTeam2");
        CricketTeam cricketTeam3 = new CricketTeam("CricketTeam3");
        CricketTeam cricketTeam4 = new CricketTeam("CricketTeam4");
        ChessTeam chessTeam1 = new ChessTeam("ChessTeam1");
        ChessTeam chessTeam2 = new ChessTeam("ChessTeam2");

        League<CricketTeam> pcl = new League<>("PCL");
        System.out.println(pcl.addTeamInLeague(cricketTeam1));
        System.out.println(pcl.addTeamInLeague(cricketTeam2));
        System.out.println(pcl.addTeamInLeague(cricketTeam3));
        System.out.println(pcl.addTeamInLeague(cricketTeam4));

        League<FootbalTeam> pfl = new League<>("PFL");
        System.out.println(pfl.addTeamInLeague(footballTeam1));
        System.out.println(pfl.addTeamInLeague(footballTeam2));

        League<ChessTeam> ccl = new League<>("CCl");
        System.out.println(ccl.addTeamInLeague(chessTeam1));
        System.out.println(ccl.addTeamInLeague(chessTeam2));

        pcl.match(cricketTeam1, cricketTeam2, "won");
        pcl.match(cricketTeam1, cricketTeam2, "loss");
        pcl.match(cricketTeam1, cricketTeam3, "won");
        pcl.match(cricketTeam3, cricketTeam2, "won");
        pcl.match(cricketTeam1, cricketTeam2, "won");
        pcl.match(cricketTeam4, cricketTeam2, "loss");
        pcl.match(cricketTeam1, cricketTeam4, "won");
        pcl.match(cricketTeam1, cricketTeam2, "won");

        pcl.leagueTable();

    }
}
