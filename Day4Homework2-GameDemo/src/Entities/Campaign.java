package Entities;

public class Campaign {
    private String id;
    private String name;
    private int    percentage;
    private Game   game;

    public Campaign(String id, String name, int percentage, Game game) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
