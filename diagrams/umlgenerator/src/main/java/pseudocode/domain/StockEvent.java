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
  private UUID sourceId;
  private UUID destinationId;
  private Date occurredDate;
  private Date noticedDate;
  private String signature;
  private String reasonFreeText;
  private String sourceFreeText;
  private String destinationFreeText;

  public List<StockCardLineItem> toLineItems() {
    StockCardLineItem stockCardLineItem = new StockCardLineItem();
    stockCardLineItem.setOriginEvent(this);
    return Arrays.asList(stockCardLineItem);
  }
}
