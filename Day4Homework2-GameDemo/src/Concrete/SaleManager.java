package Concrete;


import Entities.Sale;
import Interfaces.LoggerService;
import Interfaces.SaleService;

public class SaleManager implements SaleService {

    LoggerManager loggerManager;

    public SaleManager(LoggerService loggerService) {
        this.loggerManager = new LoggerManager(loggerService);
    }

    @Override
    public void buyGame(Sale sale) {
        System.out.println(sale.getGame().getName() + " adli oyunun satisi " + sale.getUser().getFirstName() + " adli oyuncuya tarafindan gerceklesti...");
        sale.getGame().increaseNumberOfSales();
        loggerManager.log();
    }

    @Override
    public void returnGame(Sale sale) {
        System.out.println(sale.getGame().getName() + " adli oyunun geri iadesi " + sale.getUser().getFirstName() + " adli oyuncuya tarafindan gerceklesti...");
        sale.getGame().decreaseNumberOfSales();
        loggerManager.log();
    }

}
