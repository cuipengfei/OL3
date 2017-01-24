package pseudocode.domain;

import java.util.List;
import java.util.UUID;

public class StockCardLineItem {
  private Integer stockOnHand;
  private StockMovementReason stockMovementReason;
  private Integer quantity;

  public UUID getStockCardId() {
    return null;
  }

  public StockCard getStockCard() {
    return new StockCard();
  }

  public static List<StockCardLineItem> createFrom(StockEvent savedEvent) {
    return null;
  }

  public void applyToPreviousSOH(Integer previousQuantity) {
    setStockOnHand(recalculateSOH(previousQuantity));
  }

  private Integer recalculateSOH(Integer previousItem) {
    this.getQuantity();
    this.getStockMovementReason();
    return 1;
  }

  public void setStockOnHand(Integer stockOnHand) {
    this.stockOnHand = stockOnHand;
  }

  public Integer getStockOnHand() {
    return stockOnHand;
  }

  public StockMovementReason getStockMovementReason() {
    return stockMovementReason;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public void setStockMovementReason(StockMovementReason stockMovementReason) {
    this.stockMovementReason = stockMovementReason;
  }
}
