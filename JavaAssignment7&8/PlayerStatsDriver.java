package main;

    class PlayerStats {
    protected String playerName;
    protected int age;
    protected String team;

    public PlayerStats(String playerName, int age, String team) {
        this.playerName = playerName;
        this.age = age;
        this.team = team;
    }

    public void displayBasicInfo() {
        System.out.println("Player: " + playerName + ", Age: " + age + ", Team: " + team);
    }
}

   class FootballStats extends PlayerStats {
    private int goals;
    private int assists;
    private int matchesPlayed;

    public FootballStats(String playerName, int age, String team, int goals, int assists, int matchesPlayed) {
        super(playerName, age, team);
        this.goals = goals;
        this.assists = assists;
        this.matchesPlayed = matchesPlayed;
    }

    public void displayFootballStats() {
        displayBasicInfo();
        System.out.println("Football Stats - Matches: " + matchesPlayed + ", Goals: " + goals + ", Assists: " + assists);
    }
}


   class CricketStats extends PlayerStats {
    private int runs;
    private int wickets;
    private int matchesPlayed;

    public CricketStats(String playerName, int age, String team, int runs, int wickets, int matchesPlayed) {
        super(playerName, age, team);
        this.runs = runs;
        this.wickets = wickets;
        this.matchesPlayed = matchesPlayed;
    }

    public void displayCricketStats() {
        displayBasicInfo();
        System.out.println("Cricket Stats - Matches: " + matchesPlayed + ", Runs: " + runs + ", Wickets: " + wickets);
    }
}



public class PlayerStatsDriver {
    public static void main(String[] args) {
        // Create a football player
        FootballStats footballPlayer = new FootballStats("Lionel Messi", 36, "Inter Miami", 30, 20, 25);
        footballPlayer.displayFootballStats();

        System.out.println();

        // Create a cricket player
        CricketStats cricketPlayer = new CricketStats("Virat Kohli", 35, "India", 12000, 4, 260);
        cricketPlayer.displayCricketStats();
    }
}
