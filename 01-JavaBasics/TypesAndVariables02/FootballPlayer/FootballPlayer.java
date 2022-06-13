package Basics.TypesAndVariables02.FootballPlayer;

public class FootballPlayer {
    public int no;
    public String name;
    public boolean inPlay;
    public int minutes;
    public int numberOfGoals;   //default value of "int class variables = 0"

    void play(int minutesToPlay){
        minutes += minutesToPlay;
    }

    void score(int goalCount){
        numberOfGoals += goalCount;
    }
}
