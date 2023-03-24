package Module_2.SportsTeamApp;

public class Team {
    private String teamName = "";
    private String[] players = new String[20];
    private int playerCount = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(String name){
        this.players[playerCount] = name;
        this.playerCount++;
    }

    public String[] getPlayers() {
        return this.players;
    }

    public int getPlayerCount() {
        return this.playerCount;
    }

    public String getTeamName() {
        return this.teamName;
    }


}
