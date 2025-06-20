public class Player {
    private String name;
    private Team team ; // since it's bidirectional
    private boolean expert;

    public Player(String name, Team team, boolean expert) {
        this.name = name;
        this.team = team;
        this.expert = expert;
    }
}
