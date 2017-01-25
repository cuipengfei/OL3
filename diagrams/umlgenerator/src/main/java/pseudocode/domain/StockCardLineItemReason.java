package pseudocode.domain;

public class StockCardLineItemReason {
  private String name;
  private StockCardLineItemReasonType type;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StockCardLineItemReasonType getType() {
    return type;
  }

  public void setType(StockCardLineItemReasonType type) {
    this.type = type;
  }
}
