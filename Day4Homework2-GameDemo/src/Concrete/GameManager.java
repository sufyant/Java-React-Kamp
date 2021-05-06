package Concrete;

import Entities.Game;
import Interfaces.GameService;
import Interfaces.LoggerService;

public class GameManager implements GameService {

    LoggerManager loggerManager;

    public GameManager(LoggerService loggerService) {
        this.loggerManager = new LoggerManager(loggerService);
    }

    @Override
    public void addGame(Game game) {
        System.out.println(game.getName() + " adli oyun eklendi...");
        loggerManager.log();
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getName() + " adli oyun silindi");
        loggerManager.log();
    }

    @Override
    public void showTotalSales(Game game) {
        System.out.println(game.getName() + " adli oyunun toplam satis adedi: " + game.getNumberOfSales());
        loggerManager.log();
    }
}
