package Interfaces;


import Entities.Game;

public interface GameService {
    void addGame(Game game);
    void deleteGame(Game game);
    void showTotalSales(Game game);
}
