public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team<>("liverpool");

        // Team<String> brokenTeam = new Team<>("This wont work"); === T extends Player, types belong to Player are eligible

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);





    }

}
