package pseudocode.repositories;

import pseudocode.domain.StockCardLineItem;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface StockCardLineItemsRepository {
  StockCardLineItem save(StockCardLineItem lineItem);

  List<StockCardLineItem> findBy(UUID stockCardId, Date occurredDate, Date noticedDate);
}
