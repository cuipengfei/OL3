package pseudocode.services;

import pseudocode.domain.StockCardLineItem;
import pseudocode.domain.StockEvent;
import pseudocode.repositories.StockEventsRepository;

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
    stockCardService.save(StockCardLineItem.createFrom(savedEvent));

    return savedEvent;
  }
}
