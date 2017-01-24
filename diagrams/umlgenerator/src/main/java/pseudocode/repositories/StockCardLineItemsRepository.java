package pseudocode.repositories;

import pseudocode.domain.StockCardLineItem;

public interface StockCardLineItemsRepository {
  StockCardLineItem save(StockCardLineItem lineItem);
}
