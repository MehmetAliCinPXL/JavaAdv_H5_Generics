package be.pxl.ja.oefening1;

import javax.naming.spi.ObjectFactoryBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team<T> implements Comparable<Team>{

    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private List<T> members = new ArrayList<>();

    public Team(String name){
     this.name = name;
    }



    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public void numberOfPlayers(){
        System.out.println(members.size());
    }

    public  void addPlayer(T player){
        members.add(player);
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        this.played += 1;
        opponent.played += 1;

        if (ourScore > theirScore){
            this.won += 1;
            opponent.lost +=1;
        }else if(theirScore >  ourScore){
            opponent.won += 1;
            this.lost += 1;
        }
        this.tied += 1;
        opponent.tied += 1;
    }

    public int ranking(){
        return won * 3 + tied;
    }
    @Override
    public int compareTo(Team o) {
        return o.ranking() -  this.ranking();
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");
        Team<SoccerPlayer> barcelona = new Team<>("FC Barcelona");
        realMadrid.addPlayer(new SoccerPlayer("Sergio Ramos"));
        realMadrid.numberOfPlayers();
        System.out.println(realMadrid.members);
        //realMadrid.matchResult(baseballPlayerTeam, 3, 2);
        List<Team> scoreboard = new ArrayList<>();
        scoreboard.add(realMadrid);
        scoreboard.add(barcelona);
        realMadrid.matchResult(barcelona, 6, 4);
        Collections.sort(scoreboard);
        System.out.println(scoreboard);
    }


}
