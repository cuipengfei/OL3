package pseudocode.repositories;

import pseudocode.domain.StockEvent;

public interface StockEventsRepository {
  StockEvent save(StockEvent event);
}
