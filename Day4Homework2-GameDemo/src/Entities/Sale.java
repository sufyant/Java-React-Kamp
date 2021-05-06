package Entities;

public class Sale {
    private String id;
    private User   user;
    private Game   game;

    public Sale(String id, User user, Game game) {
        this.id = id;
        this.user = user;
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
