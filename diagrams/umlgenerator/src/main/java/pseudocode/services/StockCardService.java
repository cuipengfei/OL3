package pseudocode.services;

import pseudocode.domain.StockCard;
import pseudocode.domain.StockCardLineItem;
import pseudocode.repositories.StockCardsRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StockCardService {
  private StockCardsRepository stockCardsRepository;

  public void save(List<StockCardLineItem> stockCardLineItems) {
    for (StockCardLineItem stockCardLineItem : stockCardLineItems) {
      UUID cardId = stockCardLineItem.getStockCardId();
      StockCard stockCard = stockCardsRepository.findOne(cardId);

      if (isFirstLineItem(stockCard)) {
        stockCard = StockCard.createFrom(stockCardLineItem);
      }

      stockCardsRepository.save(stockCard);
    }
  }

  private boolean isFirstLineItem(StockCard stockCard) {
    return stockCard == null;
  }

  public StockCard findOnDateAsReportedOnDate(
          UUID stockCardId, Date occurredDate, Date noticedDate) {
    StockCard stockCard = stockCardsRepository.findOne(stockCardId, occurredDate, noticedDate);

    List<StockCardLineItem> orderedLineItems =
            orderByOccurredThenNoticed(stockCard.getLineItems(), occurredDate, noticedDate);

    StockCardLineItem previousItem = orderedLineItems.get(0);
    for (int index = 1; index < orderedLineItems.size(); index++) {
      StockCardLineItem lineItem = orderedLineItems.get(index);
      lineItem.applyToPreviousStockOnHand(previousItem.getQuantity());
      previousItem = lineItem;
    }

    return stockCard;
  }

  private List<StockCardLineItem> orderByOccurredThenNoticed
          (List<StockCardLineItem> lineItems, Date occurredDate, Date noticedDate) {
    return null;
  }
}
