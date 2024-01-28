/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class Team {
    private String name;
    private int games;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
    }
    
    public void playGame(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {

        if (homeTeam.equals(this.name)) {
            this.games++;

            if (homeTeamPoints > visitingTeamPoints) {
                this.wins++;
            } else {
                this.losses++;
            }
        } else if (visitingTeam.equals(this.name)) {
            this.games++;

            if (homeTeamPoints < visitingTeamPoints) {
                this.wins++;
            } else {
                this.losses++;
            }
        }
    }
    
    public void matchStatistics() {
        System.out.println("Games: " + this.games);
        System.out.println("Wins: " + this.wins);
        System.out.println("Losses: " + this.losses);
    }
}
