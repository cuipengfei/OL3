package pseudocode.services;

import pseudocode.domain.StockCard;
import pseudocode.domain.StockCardLineItem;
import pseudocode.repositories.StockCardLineItemsRepository;
import pseudocode.repositories.StockCardsRepository;

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
}
