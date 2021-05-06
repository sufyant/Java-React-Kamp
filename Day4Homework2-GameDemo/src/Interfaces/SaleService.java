package Interfaces;


import Entities.Sale;

public interface SaleService {
    void buyGame(Sale sale);
    void returnGame(Sale sale);
}
