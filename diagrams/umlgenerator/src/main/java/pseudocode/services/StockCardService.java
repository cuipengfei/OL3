package pseudocode.services;

import pseudocode.domain.StockCard;
import pseudocode.domain.StockCardLineItem;
import pseudocode.repositories.StockCardLineItemsRepository;
import pseudocode.repositories.StockCardsRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StockCardService {
  private StockCardsRepository stockCardsRepository;
  private StockCardLineItemsRepository stockCardLineItemsRepository;

  public void save(List<StockCardLineItem> stockCardLineItems) {
    for (StockCardLineItem stockCardLineItem : stockCardLineItems) {
      UUID cardId = stockCardLineItem.getStockCardId();

      initStockCard(stockCardLineItem, cardId);

      stockCardLineItemsRepository.save(stockCardLineItem);
    }
  }

  private void initStockCard(StockCardLineItem stockCardLineItem, UUID cardId) {
    if (cardId == null || stockCardsRepository.findOne(cardId) == null) {
      stockCardsRepository.save(StockCard.createFrom(stockCardLineItem));
    }
  }

  public StockCard findAtDates(UUID stockCardId, Date occurredDate, Date noticedDate) {
    List<StockCardLineItem> lineItems = stockCardLineItemsRepository
            .findBy(stockCardId, occurredDate, noticedDate);
    lineItems = orderBy(lineItems, occurredDate, noticedDate);

    StockCardLineItem previousItem = lineItems.get(0);
    for (int index = 1; index < lineItems.size(); index++) {
      StockCardLineItem lineItem = lineItems.get(index);
      lineItem.applyToPreviousSOH(previousItem.getQuantity());
      previousItem = lineItem;
    }

    StockCard stockCard = stockCardsRepository.findOne(stockCardId);
    stockCard.setLineItems(lineItems);
    return stockCard;
  }

  private List<StockCardLineItem> orderBy
          (List<StockCardLineItem> lineItems, Date occurredDate, Date noticedDate) {
    return null;
  }
}
