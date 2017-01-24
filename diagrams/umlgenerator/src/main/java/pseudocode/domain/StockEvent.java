package pseudocode.domain;

import java.util.Arrays;
import java.util.List;

public class StockEvent {
  public List<StockCardLineItem> toLineItems() {
    return Arrays.asList(new StockCardLineItem());
  }
}
