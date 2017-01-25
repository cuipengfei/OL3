package pseudocode.repositories;

import pseudocode.domain.StockCard;

import java.util.Date;
import java.util.UUID;

public interface StockCardsRepository {
  StockCard findOne(UUID cardId, Date occurredDate, Date noticedDate);

  StockCard save(StockCard stockCard);

  StockCard findOne(UUID cardId);
}
