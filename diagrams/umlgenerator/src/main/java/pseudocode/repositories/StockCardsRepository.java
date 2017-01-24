package pseudocode.repositories;

import pseudocode.domain.StockCard;

import java.util.UUID;

public interface StockCardsRepository {
  StockCard findOne(UUID cardId);

  StockCard save(StockCard stockCard);
}
