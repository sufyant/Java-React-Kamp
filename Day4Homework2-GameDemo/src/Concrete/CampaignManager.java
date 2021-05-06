package Concrete;

import Entities.Campaign;
import Entities.Game;
import Interfaces.CampaignService;
import Interfaces.LoggerService;

public class CampaignManager implements CampaignService {

    LoggerManager loggerManager;

    public CampaignManager(LoggerService loggerService) {
        this.loggerManager = new LoggerManager(loggerService);
    }

    @Override
    public void addCampaign(Game game, Campaign campaing, double campaingDiscount) {
        System.out.println(game.getName() + " isimli oyuna " + campaingDiscount + " oraninda indirim kampanyasi baslatilmistir...");
        int newPrice = (int) (game.getPrice() - (game.getPrice() * campaingDiscount));
        game.setPrice(newPrice);
        loggerManager.log();
    }

    @Override
    public void deleteCampaign(Game game, Campaign campaing) {
        System.out.println(game.getName() + " isimli oyunadan indirim kampanyasi kaldirilmistir...");
        loggerManager.log();
    }

    @Override
    public void updateCampaign(Campaign campaing, double campaingDiscount) {
        System.out.println(campaing.getName() + " isimli kampanyanini fiyati guncellenmistir...");
        loggerManager.log();
    }
}
