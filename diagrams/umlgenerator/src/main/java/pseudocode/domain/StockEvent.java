package pseudocode.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StockEvent {

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public StockCardLineItemReason getReason() {
    return reason;
  }

  public void setReason(StockCardLineItemReason reason) {
    this.reason = reason;
  }

  public UUID getSourceId() {
    return sourceId;
  }

  public void setSourceId(UUID sourceId) {
    this.sourceId = sourceId;
  }

  public UUID getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(UUID destinationId) {
    this.destinationId = destinationId;
  }

  public Date getOccurredDate() {
    return occurredDate;
  }

  public void setOccurredDate(Date occurredDate) {
    this.occurredDate = occurredDate;
  }

  public Date getNoticedDate() {
    return noticedDate;
  }

  public void setNoticedDate(Date noticedDate) {
    this.noticedDate = noticedDate;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public String getReasonFreeText() {
    return reasonFreeText;
  }

  public void setReasonFreeText(String reasonFreeText) {
    this.reasonFreeText = reasonFreeText;
  }

  public String getSourceFreeText() {
    return sourceFreeText;
  }

  public void setSourceFreeText(String sourceFreeText) {
    this.sourceFreeText = sourceFreeText;
  }

  public String getDestinationFreeText() {
    return destinationFreeText;
  }

  public void setDestinationFreeText(String destinationFreeText) {
    this.destinationFreeText = destinationFreeText;
  }

  private Integer quantity;
  private StockCardLineItemReason reason;

  private UUID stockCardId;
  private UUID facilityId;
  private UUID programId;
  private UUID orderableId;

  private UUID userId;

  private UUID sourceId;
  private UUID destinationId;

  private Date occurredDate;
  private Date noticedDate;
  private Date savedDate;

  private String signature;

  private String reasonFreeText;
  private String sourceFreeText;
  private String destinationFreeText;

  public List<StockCardLineItem> toLineItems() {
    StockCardLineItem stockCardLineItem = new StockCardLineItem();
    stockCardLineItem.setOriginEvent(this);
    return Arrays.asList(stockCardLineItem);
  }

  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public Date getSavedDate() {
    return savedDate;
  }

  public void setSavedDate(Date savedDate) {
    this.savedDate = savedDate;
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

  public UUID getStockCardId() {
    return stockCardId;
  }

  public void setStockCardId(UUID stockCardId) {
    this.stockCardId = stockCardId;
  }
}
