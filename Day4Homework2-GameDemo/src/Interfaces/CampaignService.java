package Interfaces;


import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
    void addCampaign(Game game, Campaign campaing, double campaingDiscount);
    void deleteCampaign(Game game, Campaign campaing);
    void updateCampaign(Campaign campaing, double campaingDiscount);
}
