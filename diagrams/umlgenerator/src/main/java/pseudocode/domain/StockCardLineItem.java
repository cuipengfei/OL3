package pseudocode.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StockCardLineItem {
  private StockCard stockCard;
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
  private StockEvent originEvent;

  private Integer stockOnHand;

  public UUID getStockCardId() {
    return null;
  }

  public StockCard getStockCard() {
    return stockCard;
  }

  public static List<StockCardLineItem> createFrom(StockEvent savedEvent) {
    return null;
  }

  public void applyToPreviousStockOnHand(Integer previousQuantity) {
    this.getQuantity();
    this.getReason();
    setStockOnHand(1);
  }

  public void setStockOnHand(Integer stockOnHand) {
    this.stockOnHand = stockOnHand;
  }

  public Integer getStockOnHand() {
    return stockOnHand;
  }

  public StockCardLineItemReason getReason() {
    return reason;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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

  public Date getNoticedDate() {
    return noticedDate;
  }

  public void setNoticedDate(Date noticedDate) {
    this.noticedDate = noticedDate;
  }

  public Date getOccurredDate() {
    return occurredDate;
  }

  public void setOccurredDate(Date occurredDate) {
    this.occurredDate = occurredDate;
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

  public StockEvent getOriginEvent() {
    return originEvent;
  }

  public void setOriginEvent(StockEvent originEvent) {
    this.originEvent = originEvent;
  }

  public void setStockCard(StockCard stockCard) {
    this.stockCard = stockCard;
  }
}
