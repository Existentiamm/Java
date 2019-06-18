
package lab2;

import java.util.Date;

public abstract class Player extends Person {
    protected String position; 
    protected String club; 
    protected int scoredGoals; 

    public Player() {
        super();
        this.position = "brak";
        this.club = "brak";
        this.scoredGoals = 0;
    }

    public Player(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth);
        this.position = position;
        this.club = club;
        this.scoredGoals = scoredGoals;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    @Override
    public String toString() {
        String str= String.format("Position: %s, Club: %s, ScoredGoals: %s ", super.toString(),position, club, scoredGoals);
        return str;
    }
    
    public void details() {
        System.out.println(toString());
    }
    
    public void ScoreGoal(){
    this.scoredGoals = scoredGoals;}
}
