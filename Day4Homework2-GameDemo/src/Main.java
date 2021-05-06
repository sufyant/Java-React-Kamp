import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;
import Interfaces.LoggerService;
import Interfaces.UserCheckService;
import Loggers.DatabaseLogger;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        LoggerService   loggerService     = new DatabaseLogger();
        UserCheckService userCheckService = new MernisServiceAdapter();

        User     user1     = new User("1","süfyan","taşkı","sufyant","11111111111", new Date(1996, 9, 16));
        User     user2     = new User("1","süfyan","taşkın","sufyant","11111111111", new Date(1996, 9, 16));
        Game     game1     = new Game("1","Hitman", "Hitman is a 2015 stealth video game that was developed by IO Interactive and was released episodically for Microsoft Windows, PlayStation 4 and Xbox One from March to October 2015.", 100);
        Campaign campaign1 = new Campaign("1","Ramazan Kampanyasi", 10, game1);
        Sale     sale1     = new Sale("1", user1, game1);
        Sale     sale2     = new Sale("1", user2, game1);

        CampaignManager campaignManager = new CampaignManager(loggerService);
        GameManager     gameManager     = new GameManager(loggerService);
        SaleManager     saleManager     = new SaleManager(loggerService);
        UserManager     userManager     = new UserManager(userCheckService, loggerService);

        saleManager.buyGame(sale1);
        saleManager.buyGame(sale2);
        campaignManager.addCampaign(game1, campaign1, 10);
        gameManager.addGame(game1);
        userManager.register(user1);
        gameManager.showTotalSales(game1);



    }

}
