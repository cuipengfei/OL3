package pseudocode.services;

import pseudocode.domain.StockEvent;
import pseudocode.validators.StockEventValidator;

import java.util.List;

public class StockEventValidationsService {

  private PermissionService permissionService;

  private List<StockEventValidator> stockEventValidators;

  public void validate(StockEvent stockEvent) {
    permissionService.canUserCreateEvents(stockEvent);
    stockEventValidators.forEach(validator -> validator.validate(stockEvent));
  }
}
