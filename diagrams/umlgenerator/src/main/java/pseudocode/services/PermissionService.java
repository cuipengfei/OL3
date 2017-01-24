package pseudocode.services;

import pseudocode.domain.StockEvent;

public class PermissionService {
  public boolean canUserCreateEvents(StockEvent stockEvent) {
    return false;
  }
}
