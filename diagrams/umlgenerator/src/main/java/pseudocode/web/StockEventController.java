package pseudocode.web;

import pseudocode.domain.StockEvent;
import pseudocode.services.StockEventProcessor;

public class StockEventController {

  private StockEventProcessor stockEventProcessor;

  public StockEvent createStockEvent(StockEvent stockEvent) {
    return stockEventProcessor.process(stockEvent);
  }

}
