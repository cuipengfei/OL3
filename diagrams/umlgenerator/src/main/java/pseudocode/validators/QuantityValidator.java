package pseudocode.validators;

import pseudocode.domain.StockEvent;
import pseudocode.exceptions.StockEventValidationException;

public class QuantityValidator implements StockEventValidator {
  @Override
  public void validate(StockEvent stockEvent) {
    throw new StockEventValidationException();
  }
}
