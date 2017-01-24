package pseudocode.services;

import pseudocode.domain.StockCardLineItem;
import pseudocode.domain.StockEvent;
import pseudocode.repositories.StockEventsRepository;

import java.util.List;

public class StockEventProcessor {
  private StockEventsRepository stockEventsRepository;
  private StockEventValidationsService stockEventValidationsService;
  private StockCardService stockCardService;

  public StockEvent process(StockEvent stockEvent) {
    stockEventValidationsService.validate(stockEvent);
    return saveEventAndGenerateLineItems(stockEvent);
  }

  //granularity of transaction
  private StockEvent saveEventAndGenerateLineItems(StockEvent event) {
    StockEvent savedEvent = stockEventsRepository.save(event);
    List<StockCardLineItem> stockCardLineItems = StockCardLineItem.createFrom(savedEvent);
    stockCardService.save(stockCardLineItems);

    return savedEvent;
  }
}
