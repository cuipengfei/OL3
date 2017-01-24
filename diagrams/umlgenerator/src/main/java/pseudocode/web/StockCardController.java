package pseudocode.web;

import pseudocode.domain.StockCard;
import pseudocode.services.StockCardService;

import java.util.Date;
import java.util.UUID;

public class StockCardController {

  private StockCardService stockCardService;

  public StockCard getStockCard(UUID stockCardId, Date occurredDate, Date noticedDate) {
    return stockCardService.findAtDates(stockCardId, occurredDate, noticedDate);
  }
}
