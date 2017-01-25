package pseudocode.domain;

import java.util.List;
import java.util.UUID;

public class StockCard {
  private UUID facilityId;
  private UUID programId;
  private UUID productId;
  private StockEvent originEvent;

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

  public UUID getProductId() {
    return productId;
  }

  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  public StockEvent getOriginEvent() {
    return originEvent;
  }

  public void setOriginEvent(StockEvent originEvent) {
    this.originEvent = originEvent;
  }
}
