package pseudocode.domain;

import java.util.List;

public class StockCard {
  private List<StockCardLineItem> lineItems;

  public static StockCard createFrom(StockCardLineItem lineItem) {
    return null;
  }

  public void setLineItems(List<StockCardLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public List<StockCardLineItem> getLineItems() {
    return lineItems;
  }
}
