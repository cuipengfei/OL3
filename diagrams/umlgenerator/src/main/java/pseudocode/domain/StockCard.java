package pseudocode.domain;

import java.util.List;
import java.util.UUID;

public class StockCard {
  private UUID facilityId;
  private UUID programId;
  private UUID orderableId;
  private StockEvent originEvent;

  private List<StockCardLineItem> lineItems;

  public static StockCard createFrom(StockCardLineItem lineItem) {
    StockCard stockCard = new StockCard();
    stockCard.setOriginEvent(lineItem.getOriginEvent());
    lineItem.setStockCard(stockCard);
    return stockCard;
  }

  public void setLineItems(List<StockCardLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public List<StockCardLineItem> getLineItems() {
    return lineItems;
  }

  public UUID getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(UUID facilityId) {
    this.facilityId = facilityId;
  }

  public UUID getProgramId() {
    return programId;
  }

  public void setProgramId(UUID programId) {
    this.programId = programId;
  }

  public UUID getOrderableId() {
    return orderableId;
  }

  public void setOrderableId(UUID orderableId) {
    this.orderableId = orderableId;
  }

  public StockEvent getOriginEvent() {
    return originEvent;
  }

  public void setOriginEvent(StockEvent originEvent) {
    this.originEvent = originEvent;
  }
}
