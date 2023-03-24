package Module_2.SportsTeamApp;

import java.util.Scanner;

public class TestSportsTeamApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String continueStatus;
        System.out.println("\tWelcome to the Sports Team App");
        System.out.println();
        do {
            String teamName;
            String playerNames;
            System.out.print("\tEnter a team name: ");
            teamName = in.next();
            System.out.println();

            System.out.println("\tEnter the player names: ");
            System.out.print("\t\thint: use commas for multiple players; no spaces>: ");
            playerNames = in.next();
            System.out.println();
            String[] playerNameList = playerNames.split(",");
            Team team = new Team(teamName);
            for (int i = 0; i < playerNameList.length; i++) {
                team.addPlayer(playerNameList[i]);
            }
            System.out.println("\t--Team Summary--");
            System.out.println("\tNumber of players in team: " + team.getPlayerCount());
            System.out.print("\tPlayers on team: ");
            for (int i = 0; i < team.getPlayerCount(); i++) {
                System.out.print(team.getPlayers()[i] + ",");
            }
            System.out.println("\n");
            System.out.print("\tContinue? (y/n): ");
            continueStatus = in.next();
            System.out.println();
        } while (continueStatus.equalsIgnoreCase("y"));
        System.out.println("\tEnd of line...");
        in.close();
    }
}
