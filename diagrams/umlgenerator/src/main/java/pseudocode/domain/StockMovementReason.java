package pseudocode.domain;

public class StockMovementReason {
  private String name;
  private StockMovementType type;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StockMovementType getType() {
    return type;
  }

  public void setType(StockMovementType type) {
    this.type = type;
  }
}
